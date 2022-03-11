package be.intecbrussel.view;

import be.intecbrussel.model.Color;
import be.intecbrussel.model.Order;
import be.intecbrussel.model.Module;
import be.intecbrussel.service.ColorService;
import be.intecbrussel.service.ModuleService;
import be.intecbrussel.service.OrderService;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

// TODO: CRUD Create (save) Read (read) Update (update attribute) Delete
//  (delete order) - Product, add some, update some, delete some

public class Play {

    public static void main(String[] args) {
        // already executed
//        Color c = new Color();
//        c.setColorId(7);
//        c.setRed(111); c.setGreen(111); c.setBlue(7);
//        c.setHue(69); c.setSaturation(111f); c.setBrightness(111f);
//        c.setName("Green Whatever");
//        ColorService colorService = new ColorService();
//        colorService.addColor(c);

//        c.setName("Blue Coral");
//        colorService.updateAttribute(c);
//        colorService.deleteRecord(c);

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
        Order order = new Order();
        order.setOrderNr("ORD-202203-0002");
        order.setOrderClient("Guust");
        order.setDeliveryAddress("Flaterstraat 21"); order.setDeliveryPostal(1313); order.setDeliveryCity("Blunderstad");
        order.setVatFree(false); order.setSent(false);
        order.setOrderDate(Date.valueOf(LocalDate.now()));
        OrderService orderService = new OrderService();
        System.out.println(orderService.addOrder(order));

        // TODO: rebuild in line with structure
//        Module module = em.find(Module.class, 2);
//        System.out.println(module);
//
//        Color color = em.find(Color.class, 1);
//        System.out.println(color);
    }
}
