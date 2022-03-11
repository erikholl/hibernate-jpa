package be.intecbrussel.view;

import be.intecbrussel.model.Color;
import be.intecbrussel.model.Order;
import be.intecbrussel.service.ColorService;
import be.intecbrussel.service.OrderService;

import java.sql.Date;
import java.time.LocalDate;

public class Play {

    public static void main(String[] args) {
        // already executed
        Color c = new Color();
        c.setColorId(7);
        c.setRed(111); c.setGreen(111); c.setBlue(7);
        c.setHue(69); c.setSaturation(111f); c.setBrightness(111f);
        c.setName("Green Whatever");
        ColorService colorService = new ColorService();
        colorService.addColor(c);

        // already executed
//        Module m = new Module();
//        m.setModuleId(4); m.setModuleName("Praga"); m.setBrand("Xaoc");
//        m.setWidthInHP(20); m.setDepthInMM(45);
//        m.setPricePerUnit(new BigDecimal(460));
//        m.setCurrentPlusTwelve(210); m.setCurrentMinTwelve(180); m.setCurrentPlusFive(0);
//        m.setMainFunction("Mixer"); m.setSecondaryFunction1("VCA"); m.setSecondaryFunction2("Panning");
//        m.setUrl("https://xaocdevices.com/main/praga/");
//        ModuleService moduleService = new ModuleService();
//        moduleService.addModule(m);

//        Order order = new Order();
////        order.setId();
//        order.setOrder_number("ORD-202203-0001");
//        order.setOrder_client("Gaston");
//        order.setOrder_delivery_address("Flaterstraat 23"); order.setOrder_delivery_postalcode(1313); order.setOrder_delivery_city("Blunderstad");
//        order.setIs_vat_free(false); order.setIs_send(false);
//        order.setOrder_date(Date.valueOf(LocalDate.now()));
//        OrderService orderService = new OrderService();
//        orderService.addOrder(order);

//        Module module = em.find(Module.class, 2);
//        System.out.println(module);
//
//        Color color = em.find(Color.class, 1);
//        System.out.println(color);
    }
}
