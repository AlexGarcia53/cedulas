/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cedulas.security;

import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author jegav
 */
@Component
@Service
public class Encriptacion {
    private final BasicTextEncryptor textEncryptor;

    private String encryptionPassword;
    
    public Encriptacion(@Value("${jasypt.encryptor.password}") String encryptionPassword) {
        this.encryptionPassword = encryptionPassword;
        textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(encryptionPassword); // Puede obtenerse de una propiedad de configuración
    }

    public String encrypt(String plaintext) {
        return textEncryptor.encrypt(plaintext);
    }

    public String decrypt(String ciphertext) {
        return textEncryptor.decrypt(ciphertext);
    }
}
