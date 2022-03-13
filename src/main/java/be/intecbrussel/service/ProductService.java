package be.intecbrussel.service;

import be.intecbrussel.data.ProductDAO;
import be.intecbrussel.model.Product;

public class ProductService {
    private ProductDAO productDao;

    public ProductService() {
        this.productDao = new ProductDAO();
    }

    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    public Product findProduct(int id) {
        return productDao.findProduct(id);
    }

    public Product updateProduct(Product p) {
        return productDao.updateProduct(p);
    }

    public void deleteProduct(Product product) {
        productDao.deleteProduct(product);
    }
}
