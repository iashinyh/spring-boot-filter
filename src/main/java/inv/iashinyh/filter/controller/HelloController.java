package inv.iashinyh.filter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/")
public class HelloController {

    @GetMapping("hello")
    public String hello(@RequestParam String username) {
        log.info(username);

        return "Hello, " + username;
    }
}
