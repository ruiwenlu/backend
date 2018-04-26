package cn.springboot.controller;

import cn.springboot.model.product.Product;
import cn.springboot.service.product.ProductService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getProducts() {
        ModelAndView modelAndView = new ModelAndView("edit/product");
        PageInfo<Product> productPageInfo = productService.findProductsByPage(null,null);
        modelAndView.addObject("page",productPageInfo);
        return modelAndView;
    }

    // TODO: 2018/4/25 分页待做
}
