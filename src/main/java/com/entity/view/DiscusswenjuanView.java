package com.entity.view;

import com.entity.DiscusswenjuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问卷评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-11 21:52:37
 */
@TableName("discusswenjuan")
public class DiscusswenjuanView  extends DiscusswenjuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusswenjuanView(){
	}
 
 	public DiscusswenjuanView(DiscusswenjuanEntity discusswenjuanEntity){
 	try {
			BeanUtils.copyProperties(this, discusswenjuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
