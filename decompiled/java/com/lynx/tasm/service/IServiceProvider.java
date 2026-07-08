package com.lynx.tasm.service;

import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
public interface IServiceProvider {
    Class<? extends IServiceProvider> getServiceClass();

    void onInitialize(Context context);
}
