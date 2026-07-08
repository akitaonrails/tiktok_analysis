package com.bytedance.lynx.hybrid.service;

import X.AbstractC1076640e7i;
import X.C1533560q0g;
import X.C1533790q13;
import X.C1533910q1F;
import X.C1534660q2S;
import X.C1537480q70;
import X.InterfaceC1075470e5p;
import X.InterfaceC1294060jmO;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public interface IResourceServiceX extends InterfaceC1075470e5p {
    IResourceServiceX copyAndModifyConfig(AbstractC1076640e7i abstractC1076640e7i);

    C1533910q1F createSyncRequest(String str, RequestParams requestParams);

    C1533910q1F fetchResourceAsync(String str, RequestParams requestParams, Function1<? super C1533790q13, Unit> function1);

    C1533910q1F fetchResourceAsyncIfNeed(String str, RequestParams requestParams, Function1<? super C1533790q13, Unit> function1);

    /* synthetic */ String getBid();

    Forest getForest();

    C1533560q0g getResourceConfig();

    @Override // X.InterfaceC1075470e5p
    /* synthetic */ void onRegister(String str);

    @Override // X.InterfaceC1075470e5p
    /* synthetic */ void onUnRegister();

    C1533910q1F preload(String str, RequestParams requestParams, Function1<? super C1533790q13, Unit> function1);

    void preloadContainer(C1534660q2S c1534660q2S, String str, String str2, String str3);

    @InterfaceC1294060jmO
    void preloadContainer(String str, RequestParams requestParams, C1537480q70 c1537480q70, boolean z);
}
