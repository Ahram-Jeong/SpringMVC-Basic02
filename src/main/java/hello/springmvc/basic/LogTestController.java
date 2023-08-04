package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
// @Controller는 return 값의 String에 해당하는 뷰를 반환하지만, @RestController는 return 값의 String을 HTTP 메시지 바디에 그대로 반환
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass()); // -> @Slf4j 롬복이 제공하는 어노테이션으로 대체 가능
//     private final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);
        
        // LEVEL: TRACE > DEBUG > INFO > WARN > ERROR
        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        log.info("info log = {}", name);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);

        return "OK";
    }
}
