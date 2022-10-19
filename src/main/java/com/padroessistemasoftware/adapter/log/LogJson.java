/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.padroessistemasoftware.adapter.log;

import com.padroessistemasoftware.adapter.libs.LogGJson;
import com.padroessistemasoftware.adapter.model.ILog;
import com.padroessistemasoftware.adapter.model.RegisterLog;

/**
 *
 * @author matheus-ufes
 */
public class LogJson implements ILog {

    @Override
    public void write(RegisterLog structLog) {
        LogGJson logJson = new LogGJson();

        logJson.write(structLog);
    }

}
