package kr.ac.kumoh.gunpla;

import org.springframework.data.repository.CrudRepository;
import kr.ac.kumoh.gunpla.Mechanic;

// This will be AUTO IMPLEMENTED by Spring into a Bean called mechanicRepository
// CRUD refers Create, Read, Update, Delete
// 출처: https://spring.io/guides/gs/accessing-data-mysql/

public interface MechanicRepository 
    extends CrudRepository<Mechanic, Integer> {
}