package com.lynx.tasm.service;

/* JADX INFO: loaded from: classes21.dex */
public interface ILynxTraceService extends IServiceProvider {
    long getDefaultTraceFunction();

    @Override // com.lynx.tasm.service.IServiceProvider
    Class<? extends IServiceProvider> getServiceClass();
}
