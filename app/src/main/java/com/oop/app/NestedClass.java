package com.oop.app;

import com.oop.data.Company;

public class NestedClass {
  public static void main(String[] args) {
    Company company = new Company();
    company.setName("Pesbuk");
    
    // Agak aneh sih wkwkwk 
    Company.Employee employee = company.new Employee();
    employee.setName("Adi Cahya Saputra");

    // System.out.println(company.getName());
    System.out.println(employee.getName());

    System.out.println(employee.getCompanyName());
  }
}
