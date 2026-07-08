package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C01IN;

/* JADX INFO: loaded from: classes16.dex */
public final class AsyncAuxStreamCreateTask {
    public final AsyncAuxStreamCreateCallback callback;
    public final C01IN config;

    public AsyncAuxStreamCreateTask(C01IN c01in, AsyncAuxStreamCreateCallback asyncAuxStreamCreateCallback) {
        this.config = c01in;
        this.callback = asyncAuxStreamCreateCallback;
    }
}
