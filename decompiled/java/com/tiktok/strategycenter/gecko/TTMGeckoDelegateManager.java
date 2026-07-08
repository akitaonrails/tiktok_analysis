package com.tiktok.strategycenter.gecko;

import X.C1C7U;
import Y.ARunnableS15S2100000_34;
import com.tiktok.strategycenter.TTMStrategyCenter;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public final class TTMGeckoDelegateManager {
    public static final TTMGeckoDelegateManager INSTANCE = new TTMGeckoDelegateManager();
    public static ITTMGeckoDelegate instance;

    public static /* synthetic */ void lambda$semisugar$nativeDownloadGeckoResources$lambda$0$0(String str, String str2, Map map) {
        C1C7U.LIZ("TTMGeckoDelegateManager@e2fa.nativeDownloadGeckoResources$1L");
        nativeDownloadGeckoResources$lambda$0(str, str2, map);
        C1C7U.LIZIZ("TTMGeckoDelegateManager@e2fa.nativeDownloadGeckoResources$1L");
    }

    public final ITTMGeckoDelegate getInstance$ttm_strategy_center_release() {
        return instance;
    }

    public final void setInstance$ttm_strategy_center_release(ITTMGeckoDelegate iTTMGeckoDelegate) {
        instance = iTTMGeckoDelegate;
    }

    public static final String nativeGetGeckoResourcePath(String str, String str2) {
        ITTMGeckoDelegate iTTMGeckoDelegate = instance;
        if (iTTMGeckoDelegate != null) {
            return iTTMGeckoDelegate.LIZ(str, str2);
        }
        return null;
    }

    public static final int nativeGetGeckoResourceStatus(String str, String str2) {
        ITTMGeckoDelegate iTTMGeckoDelegate = instance;
        if (iTTMGeckoDelegate != null) {
            return iTTMGeckoDelegate.LIZIZ(str, str2);
        }
        return -999999;
    }

    public static final void nativeDownloadGeckoResources$lambda$0(String str, String str2, Map map) {
        instance.LIZJ(str, str2, map);
    }

    public static final boolean nativeDownloadGeckoResources(String str, String str2, Map<String, Object> map, boolean z) {
        ITTMGeckoDelegate iTTMGeckoDelegate = instance;
        if (iTTMGeckoDelegate != null) {
            if (z) {
                return iTTMGeckoDelegate.LIZJ(str, str2, map);
            }
            TTMStrategyCenter.getInstance().getExecutor().execute(new ARunnableS15S2100000_34(str, str2, map, 0));
            return true;
        }
        return false;
    }
}
