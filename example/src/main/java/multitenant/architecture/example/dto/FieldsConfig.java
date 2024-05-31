package multitenant.architecture.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FieldsConfig {

    @JsonProperty("name")
    private String name;
    @JsonProperty("data_tpe")
    private String dataType;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("default_value")
    private String defaultValue;
    @JsonProperty("is_mandatory")
    private Boolean isMandatory;
}
