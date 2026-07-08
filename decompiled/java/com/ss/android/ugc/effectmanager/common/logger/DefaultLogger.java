package com.ss.android.ugc.effectmanager.common.logger;

/* JADX INFO: loaded from: classes31.dex */
public final class DefaultLogger implements ILogger {
    public static final DefaultLogger INSTANCE = new DefaultLogger();

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public void e(String str, Throwable th) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public void d(String str) {
        EPLog.INSTANCE.getSEnableLog();
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public void i(String str) {
        EPLog.INSTANCE.getSEnableLog();
    }

    @Override // com.ss.android.ugc.effectmanager.common.logger.ILogger
    public void w(String str) {
        EPLog.INSTANCE.getSEnableLog();
    }
}
