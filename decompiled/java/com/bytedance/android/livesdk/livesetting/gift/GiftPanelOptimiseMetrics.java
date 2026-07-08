package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_panel_optimise_metrics")
public final class GiftPanelOptimiseMetrics {
    public static final boolean DEFAULT = false;
    public static final GiftPanelOptimiseMetrics INSTANCE = new GiftPanelOptimiseMetrics();
    public static final boolean ENABLED = true;

    public final boolean isOptimised() {
        try {
            return SettingsManager.INSTANCE.getBooleanValue("gift_panel_optimise_metrics", DEFAULT);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return DEFAULT;
        }
    }
}
