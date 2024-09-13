package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscusswenjuanEntity;
import com.entity.view.DiscusswenjuanView;

import com.service.DiscusswenjuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 问卷评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-11 21:52:37
 */
@RestController
@RequestMapping("/discusswenjuan")
public class DiscusswenjuanController {
    @Autowired
    private DiscusswenjuanService discusswenjuanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusswenjuanEntity discusswenjuan, 
		HttpServletRequest request){

        EntityWrapper<DiscusswenjuanEntity> ew = new EntityWrapper<DiscusswenjuanEntity>();
    	PageUtils page = discusswenjuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusswenjuan), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusswenjuanEntity discusswenjuan, HttpServletRequest request){
        EntityWrapper<DiscusswenjuanEntity> ew = new EntityWrapper<DiscusswenjuanEntity>();
    	PageUtils page = discusswenjuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusswenjuan), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusswenjuanEntity discusswenjuan){
       	EntityWrapper<DiscusswenjuanEntity> ew = new EntityWrapper<DiscusswenjuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusswenjuan, "discusswenjuan")); 
        return R.ok().put("data", discusswenjuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusswenjuanEntity discusswenjuan){
        EntityWrapper< DiscusswenjuanEntity> ew = new EntityWrapper< DiscusswenjuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusswenjuan, "discusswenjuan")); 
		DiscusswenjuanView discusswenjuanView =  discusswenjuanService.selectView(ew);
		return R.ok("查询问卷评论表成功").put("data", discusswenjuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusswenjuanEntity discusswenjuan = discusswenjuanService.selectById(id);
        return R.ok().put("data", discusswenjuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusswenjuanEntity discusswenjuan = discusswenjuanService.selectById(id);
        return R.ok().put("data", discusswenjuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusswenjuanEntity discusswenjuan, HttpServletRequest request){
    	discusswenjuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusswenjuan);

        discusswenjuanService.insert(discusswenjuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusswenjuanEntity discusswenjuan, HttpServletRequest request){
    	discusswenjuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusswenjuan);

        discusswenjuanService.insert(discusswenjuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusswenjuanEntity discusswenjuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusswenjuan);
        discusswenjuanService.updateById(discusswenjuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusswenjuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscusswenjuanEntity> wrapper = new EntityWrapper<DiscusswenjuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusswenjuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
