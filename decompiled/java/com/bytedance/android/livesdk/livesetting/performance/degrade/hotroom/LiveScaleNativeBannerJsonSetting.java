package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_scale_native_banner_json_enable")
public final class LiveScaleNativeBannerJsonSetting {
    public static final boolean DEFAULT = false;
    public static final LiveScaleNativeBannerJsonSetting INSTANCE = new LiveScaleNativeBannerJsonSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_scale_native_banner_json_enable", DEFAULT);
    }
}
