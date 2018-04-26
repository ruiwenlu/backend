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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView getProducts(@RequestParam(value = "keywords", required = false) String keywords, @RequestParam(value = "pageNum", required = false) Integer pageNum) {
        ModelAndView modelAndView = new ModelAndView("edit/product");
        PageInfo<Product> page = productService.findProductsByPage(pageNum,keywords);
        modelAndView.addObject("page",page);
        modelAndView.addObject("keywords",keywords);
        return modelAndView;
    }

    @RequestMapping(value = "/product/page", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView getProductsPage(@RequestParam(value = "keywords", required = false) String keywords, @RequestParam(value = "pageNum", required = false) Integer pageNum) {
        ModelAndView modelAndView = new ModelAndView("edit/product_page");
        PageInfo<Product> page = productService.findProductsByPage(pageNum,keywords);
        modelAndView.addObject("page",page);
        modelAndView.addObject("keywords",keywords);
        return modelAndView;
    }
}
