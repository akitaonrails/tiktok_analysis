package com.ss.android.ugc.aweme.ecommerce.monitor;

import X.C1120604Zw;
import X.C1121904a9;

/* JADX INFO: loaded from: classes3.dex */
public final class ECSDKMonitorServiceImpl implements IECSDKMonitorService {
    @Override // com.ss.android.ugc.aweme.ecommerce.monitor.IECSDKMonitorService
    public final void LIZ(long j) {
        C1120604Zw.LIZ.getClass();
        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJIIL) {
            return;
        }
        ECSDKTracker.INSTANCE.onSdkInit(j);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.monitor.IECSDKMonitorService
    public final void LIZLLL(String str, String str2, String str3) {
        C1120604Zw.LIZ.getClass();
        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJIIL) {
            return;
        }
        ECSDKTracker.INSTANCE.onSparkPluginStart(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.monitor.IECSDKMonitorService
    public final void LIZJ(String str, String str2, String str3, long j, int i) {
        C1120604Zw.LIZ.getClass();
        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJIIL) {
            return;
        }
        ECSDKTracker.INSTANCE.onSparkPluginEnd(str, str2, str3, j, i);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.monitor.IECSDKMonitorService
    public final void LIZIZ(boolean z, Boolean bool, String str, int i, long j, String str2) {
        ECSDKTracker.INSTANCE.onGetService(z, bool, str, i, j, str2);
    }
}
