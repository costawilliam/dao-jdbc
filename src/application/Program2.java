package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		System.out.println("Teste 01 - Department findById:");
		DepartmentDao departmentDao = DaoFactory.createDepartmenDao();
		Department department = departmentDao.findById(2);
		System.out.println(department);
		System.out.println("");

		System.out.println("Teste 02 - Department findAll:");
		List<Department> list = departmentDao.findAll();

		for (Department d : list) {
			System.out.println(d);
		}

		System.out.println("");
		System.out.println("Teste 03 - Department insert:");
		Department newDepartment = new Department(null, "Department test");
		departmentDao.insert(newDepartment);

		System.out.println("");
		System.out.println("Teste 04 - Department update:");
		newDepartment = departmentDao.findById(6);
		newDepartment.setName("Department update");
		departmentDao.update(newDepartment);

		System.out.println("");
		System.out.println("Teste 05- Department delete:");
		departmentDao.deleteById(6);

	}

}
