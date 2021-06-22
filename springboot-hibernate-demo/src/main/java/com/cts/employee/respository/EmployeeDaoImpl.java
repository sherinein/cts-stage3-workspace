package com.cts.employee.respository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.employee.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	private EntityManager entityManager;
	
	@Autowired	
	public EmployeeDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> getEmployeeByDesignation(String desig) {
		Session session=entityManager.unwrap(Session.class);
		Criteria criteria= session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("designation", desig));
		criteria.addOrder(Order.desc("empid"));
		
		List<Employee> listOfEmployee=criteria.list();
		return listOfEmployee;
	}

	@Override
	public void deleteById(int id) {
		Session session=entityManager.unwrap(Session.class);
		Query<Employee> query=session.createQuery("delete from Employee where empid=:theId");
		query.setParameter("theId", id);
		query.executeUpdate();
	}

	
}
