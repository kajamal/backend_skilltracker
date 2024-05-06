package org.example.Repository;

import org.example.Enitity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employerepo extends JpaRepository<Employee,Integer> {




}
