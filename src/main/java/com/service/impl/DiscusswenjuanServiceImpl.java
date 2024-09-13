package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusswenjuanDao;
import com.entity.DiscusswenjuanEntity;
import com.service.DiscusswenjuanService;
import com.entity.vo.DiscusswenjuanVO;
import com.entity.view.DiscusswenjuanView;

@Service("discusswenjuanService")
public class DiscusswenjuanServiceImpl extends ServiceImpl<DiscusswenjuanDao, DiscusswenjuanEntity> implements DiscusswenjuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswenjuanEntity> page = this.selectPage(
                new Query<DiscusswenjuanEntity>(params).getPage(),
                new EntityWrapper<DiscusswenjuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswenjuanEntity> wrapper) {
		  Page<DiscusswenjuanView> page =new Query<DiscusswenjuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswenjuanVO> selectListVO(Wrapper<DiscusswenjuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswenjuanVO selectVO(Wrapper<DiscusswenjuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswenjuanView> selectListView(Wrapper<DiscusswenjuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswenjuanView selectView(Wrapper<DiscusswenjuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
