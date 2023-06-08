package com.softtek.practicae01.modelo;

import org.springframework.stereotype.Component;

@Component
public class IvaSuperReducido implements IImpuesto {

    @Override
    public double calcularImpuesto(Producto p) {
        // 1.05 = 100% + 5% de IVA
        return p.getPrecio() * 1.05;
    }
}
