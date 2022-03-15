package be.intecbrussel.view;

import be.intecbrussel.model.Color;
import be.intecbrussel.model.Order;
import be.intecbrussel.model.Module;
import be.intecbrussel.model.Product;
import be.intecbrussel.service.ColorService;
import be.intecbrussel.service.ModuleService;
import be.intecbrussel.service.OrderService;
import be.intecbrussel.service.ProductService;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class Play {

    public static void main(String[] args) {
        // already executed
        Color color = new Color();
        color.setColorId(7);
        color.setRed(111); color.setGreen(111); color.setBlue(7);
        color.setHue(69); color.setSaturation(111f); color.setBrightness(111f);
        color.setName("Green Whatever");
        ColorService colorService = new ColorService();
        colorService.addColor(color);

        color.setName("Blue Coral");
        colorService.updateAttribute(color);
//        colorService.deleteRecord(color);

        // already executed
        Module m = new Module();
        m.setModuleId(5); m.setModuleName("Generate 3"); m.setBrand(
                "Joranalogue");
        m.setWidthInHP(12); m.setDepthInMM(30);
        m.setPricePerUnit(new BigDecimal(350));
        m.setCurrentPlusTwelve(130); m.setCurrentMinTwelve(115); m.setCurrentPlusFive(0);
        m.setMainFunction("Oscillator"); m.setSecondaryFunction1("LFO");
        m.setUrl("https://joranalogue.com/generate-3");
        ModuleService moduleService = new ModuleService();
        System.out.println(moduleService.addModule(m));


        // already executed
//        Order order = new Order();
//        order.setOrderNr("ORD-202203-0002");
//        order.setOrderClient("Guust");
//        order.setDeliveryAddress("Flaterstraat 21"); order.setDeliveryPostal(1313); order.setDeliveryCity("Blunderstad");
//        order.setVatFree(false); order.setSent(false);
//        order.setOrderDate(Date.valueOf(LocalDate.now()));
//        OrderService orderService = new OrderService();
//        System.out.println(orderService.addOrder(order));

        // TODO: rebuild in line with structure
//        Module module = em.find(Module.class, 2);
//        System.out.println(module);
//
//        Color color = em.find(Color.class, 1);
//        System.out.println(color);

        ProductService productService = new ProductService();
//        Product product = new Product();
//        product.setOrderId("ORD-202203-0001");
//        product.setProductName("kaas");
//        product.setAmount(3);
//        product.setPricePerUnit(new BigDecimal(8.49));
//        productService.addProduct(product);

        // find
        Product product = productService.findProduct(7);
        System.out.println(product);

        // update (needs a find first)
//        product.setProductName("productUpdate");
//        Product productUpdate = productService.updateProduct(product);
//        System.out.println(productUpdate);

        // delete
        productService.deleteProduct(product);
    }
}
