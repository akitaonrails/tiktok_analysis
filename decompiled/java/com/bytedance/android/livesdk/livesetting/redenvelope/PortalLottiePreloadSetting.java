package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_portal_push_into_lottie_preload_enable")
public final class PortalLottiePreloadSetting {
    public static final boolean DEFAULT = false;
    public static final PortalLottiePreloadSetting INSTANCE = new PortalLottiePreloadSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_portal_push_into_lottie_preload_enable", DEFAULT);
    }
}
