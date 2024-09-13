package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswenjuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswenjuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswenjuanView;


/**
 * 问卷评论表
 *
 * @author 
 * @email 
 * @date 2021-03-11 21:52:37
 */
public interface DiscusswenjuanService extends IService<DiscusswenjuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswenjuanVO> selectListVO(Wrapper<DiscusswenjuanEntity> wrapper);
   	
   	DiscusswenjuanVO selectVO(@Param("ew") Wrapper<DiscusswenjuanEntity> wrapper);
   	
   	List<DiscusswenjuanView> selectListView(Wrapper<DiscusswenjuanEntity> wrapper);
   	
   	DiscusswenjuanView selectView(@Param("ew") Wrapper<DiscusswenjuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswenjuanEntity> wrapper);
   	
}

