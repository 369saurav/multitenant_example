package multitenant.architecture.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddDepartmentRequest {

    @JsonProperty("department_name")
    private String departmentName;
    @JsonProperty("custom_fields")
    private List<DepartmentFields> customFields;

}
