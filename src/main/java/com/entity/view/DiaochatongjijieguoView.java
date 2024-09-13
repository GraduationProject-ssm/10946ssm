package com.entity.view;

import com.entity.DiaochatongjijieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 调查统计结果
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-11 21:52:36
 */
@TableName("diaochatongjijieguo")
public class DiaochatongjijieguoView  extends DiaochatongjijieguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiaochatongjijieguoView(){
	}
 
 	public DiaochatongjijieguoView(DiaochatongjijieguoEntity diaochatongjijieguoEntity){
 	try {
			BeanUtils.copyProperties(this, diaochatongjijieguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
