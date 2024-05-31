package multitenant.architecture.example.repositories;


import multitenant.architecture.example.entities.Department;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface DepartmentRepository extends R2dbcRepository<Department, Long> {
    Flux<Department> findByTenantId(Long tenantId);

}