package com.ss.android.ugc.aweme.im.saas.host.api.im;

import X.C05O2;
import X.EnumC908290ZkB;
import X.InterfaceC902990Zbd;
import X.InterfaceC908320ZkE;
import android.app.Activity;

/* JADX INFO: loaded from: classes15.dex */
public interface IMNetworkSaasApi {
    public static final C05O2 LIZ = C05O2.LIZ;

    void LIZ(Activity activity, InterfaceC908320ZkE interfaceC908320ZkE, String str);

    boolean LIZIZ();

    void LIZJ(InterfaceC902990Zbd interfaceC902990Zbd);

    void LIZLLL(InterfaceC902990Zbd interfaceC902990Zbd);

    boolean LJLJLJ();

    EnumC908290ZkB getNetworkState();

    InterfaceC908320ZkE getNetworkStateForSharePanel();

    int getNqeNetworkLevel();

    boolean isNetworkAvailable();
}
