package com.bytedance.i18n.location.api;

import X.C092O;
import X.C1207210hWJ;
import X.C1216920hly;
import X.C1798590wu9;
import X.C1798680wuI;
import X.InterfaceC1294060jmO;
import X.InterfaceC1797790wsr;
import android.content.Context;
import kotlin.Pair;
import kotlin.jvm.internal.AwS462S0200000_27;

/* JADX INFO: loaded from: classes28.dex */
public interface LocationClient extends InterfaceC1797790wsr {
    public static final C1798590wu9 LIZ = C1798590wu9.LIZ;

    Pair LIZ(String str, String str2);

    void LIZJ();

    int LIZLLL();

    void LJFF();

    int LJIIIZ(Context context);

    @InterfaceC1294060jmO
    LocationData LJIIJ(C1216920hly c1216920hly);

    int LJIIJJI();

    boolean LJIIL();

    boolean LJIILJJIL(Context context);

    void LJIILL(C1798680wuI c1798680wuI, C1207210hWJ c1207210hWJ, AwS462S0200000_27 awS462S0200000_27);

    boolean LJIILLIIL(Context context);

    Pair<Boolean, String> LJIIZILJ();

    void LJIJ(C092O c092o, C1216920hly c1216920hly);

    int LJIJI(Context context);

    void deInit();

    boolean isInitialized();

    boolean isLocationPermissionGranted(Context context);

    boolean isLocationServiceEnabled(Context context);
}
