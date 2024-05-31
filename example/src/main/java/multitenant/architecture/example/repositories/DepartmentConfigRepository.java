package multitenant.architecture.example.repositories;


import multitenant.architecture.example.entities.Department;
import multitenant.architecture.example.entities.DepartmentConfig;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface DepartmentConfigRepository extends R2dbcRepository<DepartmentConfig, Long> {


}