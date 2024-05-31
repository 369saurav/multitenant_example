package multitenant.architecture.example.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import multitenant.architecture.example.dto.AddDepartmentConfigRequest;
import multitenant.architecture.example.dto.AddDepartmentRequest;
import multitenant.architecture.example.entities.Department;
import multitenant.architecture.example.entities.DepartmentConfig;
import multitenant.architecture.example.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{tenantId}")
    public Flux<Department> getDepartments(@PathVariable Long tenantId) {
        return departmentService.getDepartmentsByTenant(tenantId);
    }

    @PostMapping
    public Mono<Department> createDepartment(@RequestBody AddDepartmentRequest addDepartmentRequest) throws JsonProcessingException {
        return departmentService.saveDepartment(addDepartmentRequest);
    }

    @PostMapping("/config")
    public Mono<DepartmentConfig> createDepartmentConfig(@RequestBody AddDepartmentConfigRequest addDepartmentConfigRequest) {
        return departmentService.saveDepartmentConfig(addDepartmentConfigRequest);
    }
}