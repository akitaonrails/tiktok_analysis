package com.lynx.tasm.service;

/* JADX INFO: loaded from: classes21.dex */
public interface ILynxLogService extends IServiceProvider {
    long getDefaultWriteFunction();

    boolean getLogToSystemStatus();

    @Override // com.lynx.tasm.service.IServiceProvider
    Class<? extends IServiceProvider> getServiceClass();

    boolean isLogOutputByPlatform();

    void logByPlatform(int i, String str, String str2);

    void switchLogToSystem(boolean z);
}
