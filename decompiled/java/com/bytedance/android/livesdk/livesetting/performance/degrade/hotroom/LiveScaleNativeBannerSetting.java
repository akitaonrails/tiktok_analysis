package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_scale_native_banner_enable")
public final class LiveScaleNativeBannerSetting {
    public static final boolean DEFAULT = false;
    public static final LiveScaleNativeBannerSetting INSTANCE = new LiveScaleNativeBannerSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_scale_native_banner_enable", DEFAULT);
    }
}
