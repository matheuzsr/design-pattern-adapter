/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.padroessistemasoftware.adapter.libs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.padroessistemasoftware.adapter.model.RegisterLog;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author matheus-ufes
 */
public class LogGJson {

    // TODO: Possível melhoria seria salvar em formato de array para assim possibilitar a concatenação correta
    public void write(RegisterLog registerLog) {
        try {
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();

            String log = gson.toJson(registerLog, RegisterLog.class);

            Files.write(Paths.get("src/main/java/com/padroessistemasoftware/adapter/resources/log.json"),
                    log.getBytes(), StandardOpenOption.APPEND);

        } catch (IOException exception) {
            exception.printStackTrace();
            throw new RuntimeException("Erro na escrita do arquivo");
        }
    }
}
