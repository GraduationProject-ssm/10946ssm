package com.entity.vo;

import com.entity.DiaochatongjijieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 调查统计结果
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-11 21:52:36
 */
public class DiaochatongjijieguoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 问卷封面
	 */
	
	private String wenjuanfengmian;
		
	/**
	 * 就业满意度
	 */
	
	private String jiuyemanyidu;
		
	/**
	 * 统计人数
	 */
	
	private Integer tongjirenshu;
		
	/**
	 * 提交时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tijiaoshijian;
				
	
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
	 * 设置：就业满意度
	 */
	 
	public void setJiuyemanyidu(String jiuyemanyidu) {
		this.jiuyemanyidu = jiuyemanyidu;
	}
	
	/**
	 * 获取：就业满意度
	 */
	public String getJiuyemanyidu() {
		return jiuyemanyidu;
	}
				
	
	/**
	 * 设置：统计人数
	 */
	 
	public void setTongjirenshu(Integer tongjirenshu) {
		this.tongjirenshu = tongjirenshu;
	}
	
	/**
	 * 获取：统计人数
	 */
	public Integer getTongjirenshu() {
		return tongjirenshu;
	}
				
	
	/**
	 * 设置：提交时间
	 */
	 
	public void setTijiaoshijian(Date tijiaoshijian) {
		this.tijiaoshijian = tijiaoshijian;
	}
	
	/**
	 * 获取：提交时间
	 */
	public Date getTijiaoshijian() {
		return tijiaoshijian;
	}
			
}
