package com.jsp.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.dto.Student;

public class StudentDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("naveen");

	public Student svaeStudent(Student student) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (student != null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
		}
		return student;
	}

	public Student updateStudent(Student student) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student2 = entityManager.find(Student.class, student.getId());

		if (student2 != null) {

			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();

		}

		return student;
	}

	public Student getStudentById(int id) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		return entityManager.find(Student.class, id);

	}

	public List<Student> getAll() {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("select a from Student a");

		return query.getResultList();
	}

	public Student deleteStudent(int id) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student2 = entityManager.find(Student.class, id);

		if (student2 != null) {
			entityTransaction.begin();
			entityManager.remove(student2);
			entityTransaction.commit();
		}
		return student2;
	}

	public Student login(String name, long phNo) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("select a from Student a where name=?1 and phNo=?2");

		query.setParameter(1, name);
		query.setParameter(2, phNo);

		List<Student> list = query.getResultList();
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;

	}

	public List<Student> getByPosition(String name) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("select a from Student a where name=?1");

		query.setParameter(1, name);

		return query.getResultList();
	}

	public List<Student> deleteByName(String name) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Query query = entityManager.createQuery("select a from Student a where name=?1");

		query.setParameter(1, name);
		
		List<Student> list= query.getResultList();
		
		if(list.size()>0) {
			 for(Student student:list) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
			}
		}
		
		return list;
	}

}
