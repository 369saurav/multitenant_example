package multitenant.architecture.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddDepartmentConfigRequest {

    @JsonProperty("tenant_id")
    private UUID tenantId;

    @JsonProperty("status")
    private String status;

    @JsonProperty("fields_config")
    private List<FieldsConfig> fields_config;
}
