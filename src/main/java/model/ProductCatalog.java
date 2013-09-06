package model;

import javax.xml.bind.annotation.*;
import java.util.Set;

/**
 * User: tom
 * Date: 9/5/13
 * Time: 9:44 AM.
 */
@XmlRootElement(namespace = "http://tommotley.com/product-catalog")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ProductCatalog {

    private String id;

    private String name;

    private Set<ProductCategory> primaryCategories;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElementWrapper(name = "primary-categories")
    @XmlElement(name = "categorySet")
    public Set<ProductCategory> getPrimaryCategories() {
        return primaryCategories;
    }

    public void setPrimaryCategories(Set<ProductCategory> primaryCategories) {
        this.primaryCategories = primaryCategories;
    }
}
