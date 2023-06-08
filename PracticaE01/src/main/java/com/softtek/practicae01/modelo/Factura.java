package com.softtek.practicae01.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@NoArgsConstructor
@Data
public class Factura {
    private IImpuesto impuesto;
    private List<Producto> productos = new ArrayList<Producto>();

    public double calcularTotalFactura() {
        return productos.stream().mapToDouble(p -> impuesto.calcularImpuesto(p)).sum();
    }
}
