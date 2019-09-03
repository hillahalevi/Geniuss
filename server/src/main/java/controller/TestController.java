package controller;

import global.ExtendedErrorCodes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ITestProcessService;

import javax.inject.Inject;
import javax.xml.bind.ValidationException;


@RestController
@RequestMapping("/example")
public class TestController {
    @Inject
    private ITestProcessService service;
    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @PostMapping
    void addExample(@RequestBody String request) {
        try {
            //todo add file processing logic
            service.addTest(request);
        } catch (Exception e) {
            ValidationException ve = new ValidationException("file named " + request + " doesn't exist", ExtendedErrorCodes.NOT_FOUND, e);
            LOG.error("error when adding test", ve);
        }
    }
}
