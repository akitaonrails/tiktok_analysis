package com.ss.android.ugc.aweme.account.reactive;

import X.C0XYH;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501370pAl;

/* JADX INFO: loaded from: classes14.dex */
public interface ReactiveAccountApi {
    public static final C0XYH LIZ = C0XYH.LIZ;

    @InterfaceC1501170pAR("/passport/deactivation/do/")
    C11NZ<String> reactiveDeactivationAccount(@InterfaceC1501370pAl("x-tt-passport-csrf-token") String str);

    @InterfaceC1501160pAQ("/passport/cancel/do/")
    C11NZ<String> reactiveDeletedAccount(@InterfaceC1501070pAH("type") int i);
}
