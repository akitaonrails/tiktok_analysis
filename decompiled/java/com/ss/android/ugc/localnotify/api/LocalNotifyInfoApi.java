package com.ss.android.ugc.localnotify.api;

import X.C0CQL;
import X.C11NZ;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes5.dex */
public interface LocalNotifyInfoApi {
    public static final C0CQL LIZ = C0CQL.LIZ;

    @InterfaceC1501170pAR("/cloudpush/client_notify/pull")
    C11NZ<LocalNotifyInfoResponse> getLocalNotifyInfo();
}
