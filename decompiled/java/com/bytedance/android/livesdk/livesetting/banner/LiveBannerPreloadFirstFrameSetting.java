package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "tiktok_live_banner_preload")
public final class LiveBannerPreloadFirstFrameSetting {
    public static final boolean DEFAULT = false;
    public static final LiveBannerPreloadFirstFrameSetting INSTANCE = new LiveBannerPreloadFirstFrameSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("tiktok_live_banner_preload", DEFAULT);
    }
}
