package model;

import javax.xml.bind.annotation.*;
import java.util.Set;

/**
 * User: tom
 * Date: 9/5/13
 * Time: 10:14 AM.
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ProductCategory {
    private String name;

    private String description;

    private ProductCategory parentCategory;

    private Set<ProductCategory> childCategories;

    private Set<String> skuSet;

    public ProductCategory() {
    }

    public ProductCategory(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductCategory getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(ProductCategory parentCategory) {
        this.parentCategory = parentCategory;
    }

    @XmlElementWrapper(name = "childCategories")
    @XmlElement(name = "childCategory")
    public Set<ProductCategory> getChildCategories() {
        return childCategories;
    }

    public void setChildCategories(Set<ProductCategory> childCategories) {
        this.childCategories = childCategories;
    }

    public Set<String> getSkuSet() {
        return skuSet;
    }

    @XmlElementWrapper(name = "products")
    @XmlElement(name="sku")
    public void setSkuSet(Set<String> skuSet) {
        this.skuSet = skuSet;
    }
}
