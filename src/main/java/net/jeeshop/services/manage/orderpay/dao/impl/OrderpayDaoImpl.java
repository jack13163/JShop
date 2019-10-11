package net.jeeshop.services.manage.orderpay.dao.impl;import java.util.List;import net.jeeshop.core.dao.BaseDao;import net.jeeshop.core.dao.page.PagerModel;import net.jeeshop.services.manage.orderpay.bean.Orderpay;import net.jeeshop.services.manage.orderpay.dao.OrderpayDao;import org.springframework.stereotype.Repository;import javax.annotation.Resource;@Repository("manageOrderpayDaoImpl")public class OrderpayDaoImpl implements OrderpayDao {    @Resource	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	public PagerModel selectPageList(Orderpay e) {		return dao.selectPageList("manage.orderpay.selectPageList",				"manage.orderpay.selectPageCount", e);	}	public List selectList(Orderpay e) {		return dao.selectList("manage.orderpay.selectList", e);	}	public Orderpay selectOne(Orderpay e) {		return (Orderpay) dao.selectOne("manage.orderpay.selectOne", e);	}	public int delete(Orderpay e) {		return dao.delete("manage.orderpay.delete", e);	}	public int update(Orderpay e) {		return dao.update("manage.orderpay.update", e);	}	public int deletes(String[] ids) {		Orderpay e = new Orderpay();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	public int insert(Orderpay e) {		return dao.insert("manage.orderpay.insert", e);	}	public int deleteById(int id) {		return dao.delete("manage.orderpay.deleteById", id);	}	@Override	public Orderpay selectById(String id) {		return null;	}}