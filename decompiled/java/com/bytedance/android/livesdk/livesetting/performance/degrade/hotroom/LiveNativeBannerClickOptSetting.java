package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_native_banner_click_opt")
public final class LiveNativeBannerClickOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveNativeBannerClickOptSetting INSTANCE = new LiveNativeBannerClickOptSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_native_banner_click_opt", DEFAULT);
    }
}
