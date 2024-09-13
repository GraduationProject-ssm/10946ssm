package com.entity.model;

import com.entity.WenjuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 问卷
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-11 21:52:36
 */
public class WenjuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 问卷封面
	 */
	
	private String wenjuanfengmian;
		
	/**
	 * 问卷
	 */
	
	private String wenjuan;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 问卷详情
	 */
	
	private String wenjuanxiangqing;
				
	
	/**
	 * 设置：问卷封面
	 */
	 
	public void setWenjuanfengmian(String wenjuanfengmian) {
		this.wenjuanfengmian = wenjuanfengmian;
	}
	
	/**
	 * 获取：问卷封面
	 */
	public String getWenjuanfengmian() {
		return wenjuanfengmian;
	}
				
	
	/**
	 * 设置：问卷
	 */
	 
	public void setWenjuan(String wenjuan) {
		this.wenjuan = wenjuan;
	}
	
	/**
	 * 获取：问卷
	 */
	public String getWenjuan() {
		return wenjuan;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：问卷详情
	 */
	 
	public void setWenjuanxiangqing(String wenjuanxiangqing) {
		this.wenjuanxiangqing = wenjuanxiangqing;
	}
	
	/**
	 * 获取：问卷详情
	 */
	public String getWenjuanxiangqing() {
		return wenjuanxiangqing;
	}
			
}
