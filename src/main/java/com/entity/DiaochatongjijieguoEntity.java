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
 * 调查统计结果
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-11 21:52:36
 */
@TableName("diaochatongjijieguo")
public class DiaochatongjijieguoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DiaochatongjijieguoEntity() {
		
	}
	
	public DiaochatongjijieguoEntity(T t) {
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
