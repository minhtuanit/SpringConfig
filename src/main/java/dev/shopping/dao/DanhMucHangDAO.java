package dev.shopping.dao;

import java.util.List;

import dev.shopping.persistentdata.Hang;

public interface DanhMucHangDAO {
	public List<Hang> GetListHang();
	public void UpdateHang(Hang hang);
}
