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


import com.dao.DiaochatongjijieguoDao;
import com.entity.DiaochatongjijieguoEntity;
import com.service.DiaochatongjijieguoService;
import com.entity.vo.DiaochatongjijieguoVO;
import com.entity.view.DiaochatongjijieguoView;

@Service("diaochatongjijieguoService")
public class DiaochatongjijieguoServiceImpl extends ServiceImpl<DiaochatongjijieguoDao, DiaochatongjijieguoEntity> implements DiaochatongjijieguoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiaochatongjijieguoEntity> page = this.selectPage(
                new Query<DiaochatongjijieguoEntity>(params).getPage(),
                new EntityWrapper<DiaochatongjijieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiaochatongjijieguoEntity> wrapper) {
		  Page<DiaochatongjijieguoView> page =new Query<DiaochatongjijieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiaochatongjijieguoVO> selectListVO(Wrapper<DiaochatongjijieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiaochatongjijieguoVO selectVO(Wrapper<DiaochatongjijieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiaochatongjijieguoView> selectListView(Wrapper<DiaochatongjijieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiaochatongjijieguoView selectView(Wrapper<DiaochatongjijieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
