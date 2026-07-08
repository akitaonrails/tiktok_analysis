package com.ss.android.ugc.aweme.download.component_api;

import X.C01GW;
import X.C1AF0;
import X.C452501pT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class DownloadServiceManager {
    public static final DownloadServiceManager INSTANCE = new DownloadServiceManager();
    public static final C01GW downloadService$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(382));
    public static final boolean isAutoRemoveListener;
    public static final int retryExpCount;

    static {
        boolean zLIZ = false;
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        int i = SettingsManager.LIZ("download_component_exp_switch", false) ? 3 : 0;
        retryExpCount = i;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("download_component_exp_switch", false);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1AF0.LJ(th2);
        }
        isAutoRemoveListener = zLIZ;
    }

    public final IDownloadService getDownloadService() {
        return (IDownloadService) downloadService$delegate.getValue();
    }

    public final int getRetryExpCount() {
        return retryExpCount;
    }

    public final boolean isAutoRemoveListener() {
        return isAutoRemoveListener;
    }
}
