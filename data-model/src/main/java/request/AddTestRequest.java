package main.java.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import main.java.base.BaseTestRequest;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class AddTestRequest extends BaseTestRequest {
    public AddTestRequest(String name) {

    }
}
