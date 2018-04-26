package cn.springboot.service.product;

import cn.springboot.model.product.Product;
import com.github.pagehelper.PageInfo;

/**
 * Created by riven_lu on 2018/4/26.
 */
public interface ProductService {

    PageInfo<Product> findProductsByPage(Integer pageNum, String keywords);

    boolean addProduct(Product product);
}
