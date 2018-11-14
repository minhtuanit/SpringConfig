package dev.shopping.persistentdata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="hang")
public class Hang {
	@Id
	private String mahang;
	
	@Column(name="tenhang")
	private String tenhang;

	public Hang(String mahang, String tenhang) {
		super();
		this.mahang = mahang;
		this.tenhang = tenhang;
	}

	public String getMahang() {
		return mahang;
	}

	public void setMahang(String mahang) {
		this.mahang = mahang;
	}

	public String getTenhang() {
		return tenhang;
	}

	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
}
