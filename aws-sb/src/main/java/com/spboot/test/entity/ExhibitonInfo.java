package com.spboot.test.entity;



import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "exhibiton_info")
public class ExhibitonInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ei_num")
	private Integer eiNum;
	
	@Column(name = "ei_name")
	private String eiName;
	
	@Column(name = "ei_charge")
	private Integer eiCharge;
	
	@Column(name = "ei_artist")
	private String eiArtist;
	
	@Column(name = "ei_content")
	private String eiContent;
	
	@Column(name = "ei_start_date")
	private Date eiStartDate;
	
	@Column(name = "ei_end_date")
	private Date eiEndDate;
	
	@Column(name = "ei_start_time")
	private Time eiStartTime;
	
	@Column(name = "ei_end_time")
	private Time eiEndTime;
	
	@Column(name = "ei_status")
	private String eiStatus;
	
	@ManyToOne
	@JoinColumn(name = "fi_num")
	private FileInfo fileInfo;

}
