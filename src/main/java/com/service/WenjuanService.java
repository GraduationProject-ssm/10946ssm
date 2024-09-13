package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenjuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenjuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenjuanView;


/**
 * 问卷
 *
 * @author 
 * @email 
 * @date 2021-03-11 21:52:36
 */
public interface WenjuanService extends IService<WenjuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenjuanVO> selectListVO(Wrapper<WenjuanEntity> wrapper);
   	
   	WenjuanVO selectVO(@Param("ew") Wrapper<WenjuanEntity> wrapper);
   	
   	List<WenjuanView> selectListView(Wrapper<WenjuanEntity> wrapper);
   	
   	WenjuanView selectView(@Param("ew") Wrapper<WenjuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenjuanEntity> wrapper);
   	
}

