package cn.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getProducts() {
        ModelAndView modelAndView = new ModelAndView("view/project/add6");
        log.info("test");
        return modelAndView;
    }

    // TODO: 2018/4/25 分页待做
}
