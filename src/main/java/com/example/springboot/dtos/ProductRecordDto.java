package com.example.springboot.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank; //não permite string vazia
import jakarta.validation.constraints.NotNull; //não permite valores nulos

public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {

}
