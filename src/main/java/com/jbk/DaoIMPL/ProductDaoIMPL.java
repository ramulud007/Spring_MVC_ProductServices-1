package com.jbk.DaoIMPL;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.Dao.ProductDao;
import com.jbk.Entity.Product;



@Repository
public class ProductDaoIMPL implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Boolean AddProduct(Product product) {
		Session session=null;
		Boolean isAdded=false;
		
		try {
			
			session=sessionFactory.openSession();
			session.save(product);
			session.beginTransaction().commit();
			isAdded=true;
				
		} catch (PersistenceException e) {
			isAdded=false;
		} catch (Exception e) {
			e.printStackTrace();
			isAdded=false;
		}finally {
			session.close();
		}
			
		return isAdded;
	}

	@Override
	public List<Product> getAllProducts() {
	
		Session session=null;
		List<Product> list=null;
		
		try {
		session=sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Product.class);
		list = criteria.list();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return list;
	}

}
