package com.grupo02.entity;

import javax.validation.constraints.Max;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class CalificacionEntity {

  String nombre;
  @Max(100)
  double calificacion;
  String instance;
}
