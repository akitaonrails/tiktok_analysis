package com.ss.android.ugc.aweme.port.in;

import java.util.HashMap;

/* JADX INFO: loaded from: classes15.dex */
public interface IToolsCPUDataService {
    void end();

    HashMap<String, Double> getCpuData();

    HashMap<String, String> getThermalData();

    int isSavePowerEnable();

    void start();
}
