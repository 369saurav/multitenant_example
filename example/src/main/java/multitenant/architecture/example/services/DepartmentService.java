package multitenant.architecture.example.services;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.r2dbc.postgresql.codec.Json;
import multitenant.architecture.example.dto.AddDepartmentConfigRequest;
import multitenant.architecture.example.dto.AddDepartmentRequest;
import multitenant.architecture.example.entities.Department;
import multitenant.architecture.example.entities.DepartmentConfig;
import multitenant.architecture.example.repositories.DepartmentConfigRepository;
import multitenant.architecture.example.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.UUID;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private DepartmentConfigRepository departmentConfigRepository;

    @Autowired
    private ObjectMapper objectMapper;

    public Flux<Department> getDepartmentsByTenant(Long tenantId) {
        return departmentRepository.findByTenantId(tenantId);
    }


    public Mono<Department> saveDepartment(AddDepartmentRequest addDepartmentRequest) throws JsonProcessingException {

        Json json = Json.of(getString(addDepartmentRequest));
       Department department = Department.builder().tenantId(UUID.randomUUID()).departmentName(addDepartmentRequest.getDepartmentName()).customFields(json).build();
        return departmentRepository.save(department);
    }





    public Mono<DepartmentConfig> saveDepartmentConfig(AddDepartmentConfigRequest departmentConfig) {
return null;
        //        return departmentConfigRepository.save(departmentConfig);
    }









    public static String getString(AddDepartmentRequest addDepartmentRequest)
            throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(addDepartmentRequest.getCustomFields());
    }

}