package com.ss.android.ugc.aweme.tako.network;

import X.InterfaceC1364105Vn;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public interface TakoRecoveryTask {
    String getId();

    int getPriority();

    Object onNetworkRecovered(TakoRecoveryContext takoRecoveryContext, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    boolean onlyWhenVisible();
}
