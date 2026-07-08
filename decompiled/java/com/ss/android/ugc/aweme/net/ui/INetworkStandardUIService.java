package com.ss.android.ugc.aweme.net.ui;

import X.C1749280vcc;
import X.C20626215nQ;
import X.EnumC1609900rzo;
import X.InterfaceC1294060jmO;
import X.InterfaceC908430ZkP;
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public interface INetworkStandardUIService {
    InterfaceC908430ZkP getNetworkStateForSharePanel();

    int getStatusViewNeedShowForSearch(EnumC1609900rzo enumC1609900rzo, Exception exc);

    boolean isStandardUIEnable();

    void registerForNetworkChangeToasts();

    void removeLazyToast(EnumC1609900rzo enumC1609900rzo);

    void resetTipsBarrier(C1749280vcc c1749280vcc);

    void setStatusView(C1749280vcc c1749280vcc, EnumC1609900rzo enumC1609900rzo, Function0<Unit> function0, Exception exc);

    void setStatusView(C1749280vcc c1749280vcc, EnumC1609900rzo enumC1609900rzo, Function0<Unit> function0, Exception exc, C20626215nQ c20626215nQ);

    @InterfaceC1294060jmO
    void setStatusView(C1749280vcc c1749280vcc, String str, Function0<Unit> function0, Exception exc);

    void showNetworkToast(Activity activity, InterfaceC908430ZkP interfaceC908430ZkP, String str);

    void startLazyToast(EnumC1609900rzo enumC1609900rzo, Activity activity);

    void triggerNetworkTips(Activity activity, EnumC1609900rzo enumC1609900rzo, Exception exc, C1749280vcc c1749280vcc);

    @InterfaceC1294060jmO
    void triggerNetworkTips(Activity activity, String str, Exception exc, C1749280vcc c1749280vcc);
}
