package com.softtek.practicae01.modelo;

import org.springframework.stereotype.Component;

@Component
public class IvaGeneral implements IImpuesto {

    @Override
    public double calcularImpuesto(Producto p) {
        // 1.21 = 100% + 21% de IVA
        return p.getPrecio() * 1.21;
    }
}
