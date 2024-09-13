package com.dao;

import com.entity.DiscusswenjuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswenjuanVO;
import com.entity.view.DiscusswenjuanView;


/**
 * 问卷评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-11 21:52:37
 */
public interface DiscusswenjuanDao extends BaseMapper<DiscusswenjuanEntity> {
	
	List<DiscusswenjuanVO> selectListVO(@Param("ew") Wrapper<DiscusswenjuanEntity> wrapper);
	
	DiscusswenjuanVO selectVO(@Param("ew") Wrapper<DiscusswenjuanEntity> wrapper);
	
	List<DiscusswenjuanView> selectListView(@Param("ew") Wrapper<DiscusswenjuanEntity> wrapper);

	List<DiscusswenjuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswenjuanEntity> wrapper);
	
	DiscusswenjuanView selectView(@Param("ew") Wrapper<DiscusswenjuanEntity> wrapper);
	
}
