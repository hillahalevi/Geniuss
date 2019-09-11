package main.java.base;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BaseTestResponse extends BaseTest {


    private String id;


}
