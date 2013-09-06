package services;

import model.Product;
import model.ProductCatalog;
import utils.ServiceActionResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * User: tom
 * Date: 9/5/13
 * Time: 2:19 PM.
 */
@WebService(targetNamespace = "http://tommotley.com/product-catalog", name = "ProductCatalog")
public class Catalog {
    @WebMethod(action="get-product-catalog")
    public ProductCatalog getProductCatalog() {
        return new ProductCatalog();
    }

    @WebMethod(action="get-product-catalog")
    public ServiceActionResponse addProductCatalog(ProductCatalog productCatalog) {
        return ServiceActionResponse.SUCCESS;
    }

    @WebMethod(action="add-update-products-to-category")
    public ServiceActionResponse addOrUpdateProductsToCatalog(String catalogId, List<Product> productList) {
        return ServiceActionResponse.SUCCESS;
    }

    @WebMethod(action="add-update-product-category")
    public ServiceActionResponse addProductCategory(String categoryId, String categoryName, String categoryParentId) {
        return ServiceActionResponse.SUCCESS;
    }
}
