package com.softtek.practicae01;

import com.softtek.practicae01.modelo.Factura;
import com.softtek.practicae01.modelo.IvaGeneral;
import com.softtek.practicae01.modelo.IvaSuperReducido;
import com.softtek.practicae01.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaE01Application implements CommandLineRunner {

    @Autowired
    private Factura factura;

    public static void main(String[] args) {
        SpringApplication.run(PracticaE01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        factura.getProductos().add(new Producto("Vigas de metal", 50));
        factura.getProductos().add(new Producto("Plástico termorretráctil", 25));
        factura.getProductos().add(new Producto("Pasta térmica", 25));

        // 50+25+25 = 100 * 1.21 = 121
        factura.setImpuesto(new IvaGeneral());
        System.out.println("Factura con IVA General: " + factura.calcularTotalFactura());

        // 50+25+25 = 100 * 1.05 = 105
        factura.setImpuesto(new IvaSuperReducido());
        System.out.println("Factura con IVA Super Reducido: " + factura.calcularTotalFactura());
    }
}
