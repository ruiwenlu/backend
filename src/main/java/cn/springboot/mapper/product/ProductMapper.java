package cn.springboot.mapper.product;

import cn.springboot.mapper.BaseMapper;
import cn.springboot.model.product.Product;
import cn.springboot.model.simple.News;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2018/4/25.
 */
@Mapper
public interface ProductMapper extends BaseMapper<Integer,Product>{


    List<Product> findProductsByPage(String keywords);
}
