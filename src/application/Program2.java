package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDapartmentDao();
		
		System.out.println("\n===TEST 1: Department insert ====");
		
		Department newDepartmet = new Department(null, "RH");
		departmentDao.insert(newDepartmet);
		System.out.println("Inserted! new id = " + newDepartmet.getId());
		
	}

}
