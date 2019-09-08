package base;

import javax.validation.constraints.NotNull;

@Data
public class BaseTest {

    @NotNull
    private String name;

//    @NotNull
//    @Valid
//    private DummyObject complexObject;


}
