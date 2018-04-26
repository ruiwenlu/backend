package cn.springboot.service.product.impl;

import cn.springboot.common.constants.Constants;
import cn.springboot.mapper.product.ProductMapper;
import cn.springboot.model.product.Product;
import cn.springboot.model.simple.News;
import cn.springboot.service.product.ProductService;
import cn.springboot.service.simple.impl.NewsServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by riven_lu on 2018/4/26.
 */
@Service
public class ProductServiceImpl implements ProductService {

    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductMapper productMapper;

    @Override
    public PageInfo<Product> findProductsByPage(Integer pageNum, String keywords) {
        if (pageNum == null) {
            pageNum = 1;
        }
        PageHelper.startPage(pageNum, Constants.PAGE_SIZE);
        // 紧跟着的第一个select方法会被分页
        List<Product> products = productMapper.findProductsByPage(keywords);
        // 用PageInfo对结果进行包装
        PageInfo<Product> page = new PageInfo<Product>(products);
        // 测试PageInfo全部属性
        // PageInfo包含了非常全面的分页属性
        log.info("# 查询默认数据库 page.toString()={}", page.toString());
        return page;
    }
}
