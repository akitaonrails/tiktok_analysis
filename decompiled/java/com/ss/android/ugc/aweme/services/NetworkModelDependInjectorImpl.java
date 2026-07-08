package com.ss.android.ugc.aweme.services;

import X.C0C76;
import com.ss.android.ugc.aweme.api.IDebugConfig;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import com.ss.android.ugc.aweme.spi.INetworkModelDepend;

/* JADX INFO: loaded from: classes32.dex */
public final class NetworkModelDependInjectorImpl implements INetworkModelDepend {
    @Override // com.ss.android.ugc.aweme.spi.INetworkModelDepend
    public boolean isHippo() {
        IDebugConfig iDebugConfigLIZ = C0C76.LIZ();
        return iDebugConfigLIZ != null && iDebugConfigLIZ.isHippo();
    }

    @Override // com.ss.android.ugc.aweme.spi.INetworkModelDepend
    public void logException(Throwable th) {
        CrashlyticsWrapperService.LIZLLL().logException(th);
    }

    @Override // com.ss.android.ugc.aweme.spi.INetworkModelDepend
    public void log(String str, String str2) {
        CrashlyticsWrapperService.LIZLLL().log(str, str2);
    }
}
