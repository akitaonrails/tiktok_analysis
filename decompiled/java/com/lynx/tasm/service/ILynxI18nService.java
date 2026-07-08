package com.lynx.tasm.service;

import X.C0X8C;

/* JADX INFO: loaded from: classes21.dex */
public interface ILynxI18nService extends IServiceProvider {
    @Override // com.lynx.tasm.service.IServiceProvider
    Class<? extends IServiceProvider> getServiceClass();

    boolean loadLibrary(C0X8C c0x8c);

    boolean registerNapiEnv(long j);
}
