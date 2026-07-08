package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_banner_visibility_optimize")
public final class LiveBannerVisibilityOptimizeSetting {
    public static final boolean DEFAULT = true;
    public static final LiveBannerVisibilityOptimizeSetting INSTANCE = new LiveBannerVisibilityOptimizeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_banner_visibility_optimize", DEFAULT);
    }
}
