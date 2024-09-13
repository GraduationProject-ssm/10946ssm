package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 问卷
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-11 21:52:36
 */
@TableName("wenjuan")
public class WenjuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WenjuanEntity() {
		
	}
	
	public WenjuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 问卷名称
	 */
					
	private String wenjuanmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：问卷名称
	 */
	public void setWenjuanmingcheng(String wenjuanmingcheng) {
		this.wenjuanmingcheng = wenjuanmingcheng;
	}
	/**
	 * 获取：问卷名称
	 */
	public String getWenjuanmingcheng() {
		return wenjuanmingcheng;
	}
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
