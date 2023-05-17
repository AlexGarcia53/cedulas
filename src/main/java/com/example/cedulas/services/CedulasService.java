/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cedulas.services;

import com.cedulasservicegrpc.grpc.Cedulas;
import com.cedulasservicegrpc.grpc.CedulasResponse;
import com.cedulasservicegrpc.grpc.Empty;
import com.cedulasservicegrpc.grpc.cedulasServiceGrpc.cedulasServiceImplBase;
import com.example.cedulas.entity.Cedula;
import com.example.cedulas.repositories.CedulaRepository;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CedulasService extends cedulasServiceImplBase {

    @Autowired
    private CedulaRepository cedulaRepository;
    
    @Override
    public void obtenerCedulas(Empty request, StreamObserver<CedulasResponse> responseObserver) {
        
        List<Cedula> cedulas = cedulaRepository.obtenerCedulas();
        List<String> listaCedulas = new ArrayList<>();
        
        for (Cedula cedula : cedulas){
            listaCedulas.add(cedula.getCedulaMedico());
        }
        
        CedulasResponse.Builder response = CedulasResponse.newBuilder()
                .addAllCedulas(listaCedulas);
        
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
           
        
    }

    public Cedula obtenerCedula(String numCedula){
        List<Cedula> cedulas = cedulaRepository.findByCedulaMedico(numCedula);
        if(cedulas.isEmpty()) throw new RuntimeException("La cedula no existe");
        Cedula cedulaMedico = cedulas.get(0);
        return cedulaMedico;
    }
      
}
