package multitenant.architecture.example.entities;

import io.r2dbc.postgresql.codec.Json;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("department_config_tbl")
public class DepartmentConfig {
    @Id
    @Column("dep_config_id")
    private Long depConfigId;

    @Column("tenant_id")
    private UUID tenantId;

    @Column("status")
    private String status;

    @Column("field_config")
    private Json fieldConfig;

}