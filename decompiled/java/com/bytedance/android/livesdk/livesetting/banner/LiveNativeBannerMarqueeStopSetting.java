package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_native_banner_marquee_stop")
public final class LiveNativeBannerMarqueeStopSetting {
    public static final boolean DEFAULT = true;
    public static final LiveNativeBannerMarqueeStopSetting INSTANCE = new LiveNativeBannerMarqueeStopSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_native_banner_marquee_stop", DEFAULT);
    }
}
