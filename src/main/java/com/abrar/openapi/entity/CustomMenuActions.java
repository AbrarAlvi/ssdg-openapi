package com.abrar.openapi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "custom_menu_actions", schema = "slpo_aop")
@SequenceGenerator(name="custom_menu_actions_seq", sequenceName="slpo_aop.custom_menu_actions_id_seq")
public class CustomMenuActions implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Integer menuId;
	private String menuAction;	
	
	
	public CustomMenuActions() {
		
	}
	@Id
	@GeneratedValue(generator="custom_menu_actions_seq", strategy=GenerationType.SEQUENCE)
	@Column(name = "menu_id", unique = true, nullable = false)
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	
	@Column(name = "menu_action"  ,length = 40)
	public String getMenuAction() {
		return menuAction;
	}
	public void setMenuAction(String menuAction) {
		this.menuAction = menuAction;
	}	
	
}
