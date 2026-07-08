package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "tiktok_live_banner_preload_with_query")
public final class LiveBannerPreloadFirstFrameWithQuerySetting {
    public static final boolean DEFAULT = false;
    public static final LiveBannerPreloadFirstFrameWithQuerySetting INSTANCE = new LiveBannerPreloadFirstFrameWithQuerySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("tiktok_live_banner_preload_with_query", DEFAULT);
    }
}
