package utils;

import model.ProductCatalog;
import model.ProductCategory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * User: tom
 * Date: 9/5/13
 * Time: 10:54 AM.
 */
public class SchemaTest {
    public static void main(String[] args) throws Exception {
        ProductCatalog catalog = new ProductCatalog();
        catalog.setId("1");
        catalog.setName("UK Summer 2013");
        Set<ProductCategory> catSet = new HashSet();
        catSet.add(new ProductCategory("M","Men"));
        catSet.add(new ProductCategory("W","Women"));
        catSet.add(new ProductCategory("C","Children"));
        catalog.setPrimaryCategories(catSet);

        JAXBContext context = JAXBContext.newInstance(ProductCatalog.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Write to System.out
        m.marshal(catalog, System.out);

        // Write to File
        m.marshal(catalog, new File("./catalog.xml"));

        /*// get variables from our xml file, created before
        System.out.println();
        System.out.println("Output from our XML File: ");
        Unmarshaller um = context.createUnmarshaller();
        Bookstore bookstore2 = (Bookstore) um.unmarshal(new FileReader(BOOKSTORE_XML));
        ArrayList<Book> list = bookstore2.getBooksList();
        for (Book book : list) {
            System.out.println("Book: " + book.getName() + " from "
                    + book.getAuthor());
        }*/

    }
}
