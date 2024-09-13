package com.dao;

import com.entity.WenjuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenjuanVO;
import com.entity.view.WenjuanView;


/**
 * 问卷
 * 
 * @author 
 * @email 
 * @date 2021-03-11 21:52:36
 */
public interface WenjuanDao extends BaseMapper<WenjuanEntity> {
	
	List<WenjuanVO> selectListVO(@Param("ew") Wrapper<WenjuanEntity> wrapper);
	
	WenjuanVO selectVO(@Param("ew") Wrapper<WenjuanEntity> wrapper);
	
	List<WenjuanView> selectListView(@Param("ew") Wrapper<WenjuanEntity> wrapper);

	List<WenjuanView> selectListView(Pagination page,@Param("ew") Wrapper<WenjuanEntity> wrapper);
	
	WenjuanView selectView(@Param("ew") Wrapper<WenjuanEntity> wrapper);
	
}
