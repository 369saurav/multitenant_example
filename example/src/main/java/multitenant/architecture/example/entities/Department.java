package multitenant.architecture.example.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import io.r2dbc.postgresql.codec.Json;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("department_mstr_tbl")
public class Department {
    @Id
    @Column("dep_id")
    private Long depId;

    @Column("tenant_id")
    private UUID tenantId;

    @Column("department_name")
    private String departmentName;

    @Column("custom_fields")
    private Json customFields;

}