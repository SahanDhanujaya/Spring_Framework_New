package lk.ijse.repositories;

import lk.ijse.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer , Integer> {

}
