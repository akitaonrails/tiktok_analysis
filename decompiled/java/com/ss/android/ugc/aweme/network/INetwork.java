package com.ss.android.ugc.aweme.network;

import X.C1495130p0h;
import X.C1586090rNP;
import X.InterfaceC1495070p0b;
import X.InterfaceC2661011f;
import com.bytedance.retrofit2.Retrofit;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes24.dex */
public interface INetwork {
    Retrofit LIZ(InterfaceC2661011f interfaceC2661011f);

    long LIZIZ();

    void LIZJ();

    void LIZLLL(C1586090rNP c1586090rNP);

    long LJ();

    void LJFF(InterfaceC1495070p0b interfaceC1495070p0b, Executor executor);

    C1495130p0h getConfig();

    int getServerTime();

    void setAlogFuncAddr(long j);
}
