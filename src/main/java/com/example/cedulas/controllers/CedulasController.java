package com.example.cedulas.controllers;

import com.example.cedulas.dtos.WrapperResponse;
import com.example.cedulas.entity.Cedula;
import com.example.cedulas.services.CedulasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CedulasController {
    @Autowired
    CedulasService cedulasService;

    @GetMapping("/cedulas/{cedula}")
    public ResponseEntity<WrapperResponse<Cedula>> getCedula(@PathVariable String cedula){
        try{
            Cedula cedulaResponse = cedulasService.obtenerCedula(cedula);
            WrapperResponse<Cedula> response = new WrapperResponse<>("Cedula valida", cedulaResponse);
            return response.createResponse(HttpStatus.OK);
        }catch(Exception e){
            WrapperResponse<Cedula> response = new WrapperResponse<>(e.getMessage(), null);
            return response.createResponse(HttpStatus.NOT_FOUND);
        }
    }

}
