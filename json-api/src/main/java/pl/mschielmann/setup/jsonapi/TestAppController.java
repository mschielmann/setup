package pl.mschielmann.setup.jsonapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestAppController {


    @GetMapping("/api/test")
    void test() {

    }
}
