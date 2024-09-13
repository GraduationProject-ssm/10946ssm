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


import com.dao.WenjuanDao;
import com.entity.WenjuanEntity;
import com.service.WenjuanService;
import com.entity.vo.WenjuanVO;
import com.entity.view.WenjuanView;

@Service("wenjuanService")
public class WenjuanServiceImpl extends ServiceImpl<WenjuanDao, WenjuanEntity> implements WenjuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenjuanEntity> page = this.selectPage(
                new Query<WenjuanEntity>(params).getPage(),
                new EntityWrapper<WenjuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenjuanEntity> wrapper) {
		  Page<WenjuanView> page =new Query<WenjuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenjuanVO> selectListVO(Wrapper<WenjuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenjuanVO selectVO(Wrapper<WenjuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenjuanView> selectListView(Wrapper<WenjuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenjuanView selectView(Wrapper<WenjuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
