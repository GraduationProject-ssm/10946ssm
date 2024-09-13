package com.dao;

import com.entity.DiaochatongjijieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiaochatongjijieguoVO;
import com.entity.view.DiaochatongjijieguoView;


/**
 * 调查统计结果
 * 
 * @author 
 * @email 
 * @date 2021-03-11 21:52:36
 */
public interface DiaochatongjijieguoDao extends BaseMapper<DiaochatongjijieguoEntity> {
	
	List<DiaochatongjijieguoVO> selectListVO(@Param("ew") Wrapper<DiaochatongjijieguoEntity> wrapper);
	
	DiaochatongjijieguoVO selectVO(@Param("ew") Wrapper<DiaochatongjijieguoEntity> wrapper);
	
	List<DiaochatongjijieguoView> selectListView(@Param("ew") Wrapper<DiaochatongjijieguoEntity> wrapper);

	List<DiaochatongjijieguoView> selectListView(Pagination page,@Param("ew") Wrapper<DiaochatongjijieguoEntity> wrapper);
	
	DiaochatongjijieguoView selectView(@Param("ew") Wrapper<DiaochatongjijieguoEntity> wrapper);
	
}
