/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.padroessistemasoftware.adapter.log;

import com.padroessistemasoftware.adapter.libs.LogCSVWrite;
import com.padroessistemasoftware.adapter.model.ILog;
import com.padroessistemasoftware.adapter.model.RegisterLog;

/**
 *
 * @author matheus-ufes
 */
public class LogCsv implements ILog {

    @Override
    public void write(RegisterLog structLog) {
        LogCSVWrite logCsv = new LogCSVWrite();

        logCsv.write(structLog);
    }

}
