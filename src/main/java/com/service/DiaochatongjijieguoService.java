package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiaochatongjijieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiaochatongjijieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiaochatongjijieguoView;


/**
 * 调查统计结果
 *
 * @author 
 * @email 
 * @date 2021-03-11 21:52:36
 */
public interface DiaochatongjijieguoService extends IService<DiaochatongjijieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiaochatongjijieguoVO> selectListVO(Wrapper<DiaochatongjijieguoEntity> wrapper);
   	
   	DiaochatongjijieguoVO selectVO(@Param("ew") Wrapper<DiaochatongjijieguoEntity> wrapper);
   	
   	List<DiaochatongjijieguoView> selectListView(Wrapper<DiaochatongjijieguoEntity> wrapper);
   	
   	DiaochatongjijieguoView selectView(@Param("ew") Wrapper<DiaochatongjijieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiaochatongjijieguoEntity> wrapper);
   	
}

