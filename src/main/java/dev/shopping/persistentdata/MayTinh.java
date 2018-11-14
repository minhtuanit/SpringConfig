package dev.shopping.persistentdata;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "maytinh")
public class MayTinh {
	@Id
	private String mamaytinh;
	
	@Column(name="tenmaytinh")
	private String tenmaytinh;
	
	@Column(name="gia")
	private int gia;
	
	@Column(name="soluong")
	private int soluong;
	
	@Column(name="ngaysanxuat")
	private Date ngaysanxuat;
	
	@Column(name="mahang")
	private String mahang;
	
	public MayTinh() {
		super();
	}
	
	public MayTinh(String mamaytinh, String tenmaytinh, int gia, int soluong, Date ngaysanxuat, String mahang) {
		super();
		this.mamaytinh = mamaytinh;
		this.tenmaytinh = tenmaytinh;
		this.gia = gia;
		this.soluong = soluong;
		this.ngaysanxuat = ngaysanxuat;
		this.mahang = mahang;
	}
	
	public String getMamaytinh() {
		return mamaytinh;
	}
	
	public void setMamaytinh(String mamaytinh) {
		this.mamaytinh = mamaytinh;
	}
	
	public String getTenmaytinh() {
		return tenmaytinh;
	}
	
	public void setTenmaytinh(String tenmaytinh) {
		this.tenmaytinh = tenmaytinh;
	}
	
	public int getGia() {
		return gia;
	}
	
	public void setGia(int gia) {
		this.gia = gia;
	}
	
	public int getSoluong() {
		return soluong;
	}
	
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
	public Date getNgaysanxuat() {
		return ngaysanxuat;
	}
	
	public void setNgaysanxuat(Date ngaysanxuat) {
		this.ngaysanxuat = ngaysanxuat;
	}
	
	public String getMahang() {
		return mahang;
	}
	
	public void setMahang(String mahang) {
		this.mahang = mahang;
	}
}
