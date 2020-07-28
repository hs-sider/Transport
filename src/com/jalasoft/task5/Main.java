package com.jalasoft.task5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    private static List<Pedido> pedidos = new ArrayList<>();

    public static void main (String args[]) {

        popularDatos();

        System.out.println("\nEjercicio 1 - SELECT cliente FROM Pedido");
        System.out.println("----------------------------------------");
        pedidos.stream().map(pedido -> pedido.getCliente()).forEach(System.out::println);

        System.out.println("\nEjercicio 2 - SELECT cliente FROM Pedido WHERE tipoPedido = \"normal\"");
        System.out.println("----------------------------------------------------------------------");
        pedidos.stream().filter(pedido -> pedido.getTipoPedido().equals(TipoPedido.NORMAL)).map(pedido -> pedido.getCliente()).forEach(System.out::println);

        System.out.println("\nEjercicio 3 - SELECT codPedido FROM Pedido WHERE fecha = \"2002-05-05\"");
        System.out.println("-----------------------------------------------------------------------");
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2020-05-05");
            pedidos.stream().filter(pedido -> pedido.getFecha().equals(date)).map(pedido -> pedido.getCodPedido()).forEach(System.out::println);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("\nEjercicio 4 - SELECT producto FROM Detalle, Pedido WHERE Pedido.codPedido = Detalle.codPedido AND Pedido.codPedido = \"ped1\"");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        pedidos.stream().filter(pedido -> pedido.getCodPedido().equals("ped1")).flatMap(pedido -> pedido.getDetalles().stream().map(detalle -> detalle.getProducto())).forEach(System.out::println);

        System.out.println("\nEjercicio 5 - SELECT producto FROM Detalle, Pedido WHERE Pedido.codPedido = Detalle.codPedido AND cantidad > 8");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        pedidos.stream().flatMap(pedido -> pedido.getDetalles().stream().filter(detalle -> detalle.getCantidad() > 8).map(detalle -> detalle.getProducto())).forEach(System.out::println);
    }

    public static void popularDatos() {

        try {

            // PEDIDO #1
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse("2020-05-05");
            Pedido pedido1 = new Pedido("ped1", TipoPedido.NORMAL, "Juan Perez", date1);
            Detalle detalle1 = new Detalle("cod1","cocina",2, 1000, 10,1990);
            Detalle detalle2 = new Detalle("cod2","lavadora",1, 2500, 0,2500);
            Detalle detalle3 = new Detalle("cod3","plancha",5, 300, 50, 1450);

            pedido1.addDetalle(detalle1);
            pedido1.addDetalle(detalle2);
            pedido1.addDetalle(detalle3);

            pedidos.add(pedido1);

            // PEDIDO #2
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse("2020-05-03");
            Pedido pedido2 = new Pedido("ped2", TipoPedido.PROGRAMADO, "Maria Guaman", date2);
            Detalle detalle4 = new Detalle("cod4","mesa",2, 700, 30,1370);
            Detalle detalle5 = new Detalle("cod5","muebles",1, 3500, 0,3500);
            Detalle detalle6 = new Detalle("cod6","comoda",3, 800, 100, 2300);

            pedido2.addDetalle(detalle4);
            pedido2.addDetalle(detalle5);
            pedido2.addDetalle(detalle6);
            pedidos.add(pedido2);

            // PEDIDO #3
            Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse("2020-05-10");
            Pedido pedido3 = new Pedido("ped3", TipoPedido.NORMAL, "Juan Perez", date3);
            Detalle detalle7 = new Detalle("cod7","camisa",10, 100, 100,900);
            Detalle detalle8 = new Detalle("cod8","polera",20, 80, 0,1600);
            Detalle detalle9 = new Detalle("cod9","zapatos",8, 400, 200, 3000);

            pedido3.addDetalle(detalle7);
            pedido3.addDetalle(detalle8);
            pedido3.addDetalle(detalle9);
            pedidos.add(pedido3);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
