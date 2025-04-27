package edu.truongvx.demo_DB.resposibilites;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.truongvx.demo_DB.models.Customer;

@Repository
public interface ICusstomer extends JpaRepository<Customer, Integer> {

}
