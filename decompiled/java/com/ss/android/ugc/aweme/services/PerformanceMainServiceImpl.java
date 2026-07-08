package com.ss.android.ugc.aweme.services;

import X.C04TD;
import X.C1E90;
import android.app.Activity;
import com.ss.android.ugc.aweme.PerformanceMainService;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;

/* JADX INFO: loaded from: classes35.dex */
public final class PerformanceMainServiceImpl implements PerformanceMainService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.PerformanceMainService
    public Activity newAddWikiActivity() {
        return new AddWikiActivity();
    }

    @Override // com.ss.android.ugc.aweme.PerformanceMainService
    public void preloadPushSettingsManager() {
        C1E90.LIZIZ.preloadPushSettingsManager();
    }

    public static PerformanceMainService createPerformanceMainServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(PerformanceMainService.class, z);
        if (objLIZ != null) {
            return (PerformanceMainService) objLIZ;
        }
        if (C04TD.E4 == null) {
            synchronized (PerformanceMainService.class) {
                if (C04TD.E4 == null) {
                    C04TD.E4 = new PerformanceMainServiceImpl();
                }
            }
        }
        return C04TD.E4;
    }
}
