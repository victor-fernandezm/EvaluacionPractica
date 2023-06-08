package com.softtek.practicae01.modelo;

import org.springframework.stereotype.Component;

@Component
public interface IImpuesto {
    double calcularImpuesto(Producto p);
}
