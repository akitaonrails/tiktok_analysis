package com.ss.android.ugc.effectmanager.knadapt;

import X.C13SV;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;

/* JADX INFO: loaded from: classes31.dex */
public final class KNLogger implements C13SV {
    public static final KNLogger INSTANCE = new KNLogger();

    public void setEnabled(boolean z) {
    }

    @Override // X.C13SV
    public boolean getEnabled() {
        return EPLog.INSTANCE.getSEnableLog();
    }

    @Override // X.C13SV
    public void logDebug(String str, String str2) {
        EPLog.d(str, str2);
    }

    @Override // X.C13SV
    public void logError(String str, String str2) {
        EPLog.e(str, str2);
    }

    @Override // X.C13SV
    public void logWarn(String str, String str2) {
        EPLog.w(str, str2);
    }

    @Override // X.C13SV
    public void logError(String str, String str2, Throwable th) {
        EPLog.e(str, str2, th);
    }
}
