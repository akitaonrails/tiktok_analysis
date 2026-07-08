package com.ss.android.ugc.aweme.services;

import X.C1150504el;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.IAppInfoService;
import com.ss.android.ugc.aweme.offline.debug.perf.IDoolittleService;

/* JADX INFO: loaded from: classes3.dex */
public final class AppInfoServiceImpl implements IAppInfoService {
    public long getColdBootBeginTimestamp() {
        return C1150504el.LIZ().LJJII;
    }

    @Override // com.ss.android.ugc.aweme.network.spi.IAppInfoService
    public void recordRequest(String str, long j, long j2, long j3, String str2, boolean z, Throwable th) {
        IDoolittleService iDoolittleService = (IDoolittleService) PluggableExtentionKt.pluggableSpi$default(IDoolittleService.class, false, false, false, 14, null);
        if (iDoolittleService != null) {
            iDoolittleService.LIZ();
        }
    }
}
