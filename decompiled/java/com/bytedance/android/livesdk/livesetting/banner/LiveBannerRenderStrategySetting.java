package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("mt_live_banner_render_strategy")
public final class LiveBannerRenderStrategySetting {
    public static final int DEFAULT = 0;
    public static final LiveBannerRenderStrategySetting INSTANCE = new LiveBannerRenderStrategySetting();

    public final int get() {
        return SettingsManager.INSTANCE.getIntValue("mt_live_banner_render_strategy", DEFAULT);
    }
}
