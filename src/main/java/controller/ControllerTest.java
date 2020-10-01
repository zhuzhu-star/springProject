package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zhubin
 * @date ：Created in 2020/10/2 1:22 上午
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping("/controllerTest")
public class ControllerTest {

    @GetMapping("/test/{usrNm}")
    public void test(@PathVariable("usrNm") String usrNm) {
        System.out.println(usrNm);
    }
}
