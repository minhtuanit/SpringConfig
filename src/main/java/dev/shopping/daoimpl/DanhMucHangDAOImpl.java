package dev.shopping.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dev.shopping.dao.DanhMucHangDAO;
import dev.shopping.persistentdata.Hang;


@Transactional(readOnly = true)
public class DanhMucHangDAOImpl implements DanhMucHangDAO{
	@Autowired
	SessionFactory sessionFactory;
		
	@Override
	public List<Hang> GetListHang() {
		Session session = sessionFactory.getCurrentSession();
		List<Hang> ListHang = session.createQuery("from hang").getResultList();
		return ListHang;
	}

	@Transactional(readOnly = false)
	@Override
	public void UpdateHang(Hang hang) {
		
		
	}
	
}
