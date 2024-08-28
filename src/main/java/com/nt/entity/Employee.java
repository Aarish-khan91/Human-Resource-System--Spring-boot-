package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp88")
//@SQLDelete(sql = "UPDATE BOOT_EMP SET STATUS='deleted' where EMPNO=?")
//@Where(clause = "STATUS <> 'deleted'")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "emp_id_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer empno;
	@Column(length = 20)
	private String empname;
	@Column(length = 20)
	private String job;
	private Float sal;
	private Integer deptno;
	@Transient
	private String vflag = "no";
}
