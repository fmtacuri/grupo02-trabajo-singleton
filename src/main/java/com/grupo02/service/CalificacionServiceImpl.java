package com.grupo02.service;


import com.grupo02.entity.CalificacionEntity;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CalificacionServiceImpl implements CalificacionService {

  @Override
  public CalificacionEntity registrarCalificaciones(String nombre, double calificacion) {
    return CalificacionEntity.builder()
        .calificacion(calificacion)
        .nombre(nombre)
        .build();
  }
}
