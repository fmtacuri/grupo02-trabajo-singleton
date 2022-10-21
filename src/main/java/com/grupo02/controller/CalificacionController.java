package com.grupo02.controller;

import static org.springframework.http.HttpStatus.OK;

import com.grupo02.entity.CalificacionEntity;
import com.grupo02.service.CalificacionService;
import javax.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Log4j2
@RestController
public class CalificacionController {

  CalificacionService calificacionService;

  @PostMapping("/print-instace")
  ResponseEntity<Object> saveCalificacion(@Valid @RequestBody CalificacionEntity calificacion) {
    CalificacionEntity response = calificacionService.registrarCalificaciones(
        calificacion.getNombre(), calificacion.getCalificacion());
    response.setInstance(calificacionService.toString());
    return new ResponseEntity<>(response, OK);
  }

}
