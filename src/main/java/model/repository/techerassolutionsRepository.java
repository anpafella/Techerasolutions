package model.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface techerassolutionsRepository {
    @Repository
    public interface EmployeeRepository extends CrudRepository<techerasolutionid, Integer> {
    }
}
