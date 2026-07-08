package com.bytedance.android.livesdkapi.host;

import X.C006A;
import X.C1835260xrI;
import android.content.Intent;

/* JADX INFO: loaded from: classes28.dex */
public interface ILiveHostSandbox extends C006A {
    public static final C1835260xrI Companion = new Object() { // from class: X.0xrI
    };

    void appendDataFlowId(Intent intent, int i);

    boolean needInterceptBySandbox(Intent intent, int i);

    /* bridge */ /* synthetic */ void onInit();
}
