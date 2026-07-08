package com.bytedance.android.livesdkapi.host;

import X.C006A;
import X.InterfaceC1101100elA;
import X.InterfaceC1162920gMs;
import X.InterfaceC21605719h1;
import X.InterfaceC2184031Adl;
import X.InterfaceC466620IRo;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public interface IHostPerformanceMonitor extends C006A {
    void IN0();

    InterfaceC1101100elA OK1();

    String OL0();

    double Sb2();

    void Zg1();

    void cH();

    Map<String, String> fI(Context context);

    String getAppVersion();

    HashMap<String, Double> getCpuRate();

    HashMap<String, Long> getMemory();

    InterfaceC1162920gMs nt0(String str);

    InterfaceC2184031Adl q81();

    InterfaceC466620IRo r62(InterfaceC21605719h1 interfaceC21605719h1);
}
