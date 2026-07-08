package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("live_portal_push_into_lottie_async_load_enable")
public final class PortalLottieAsyncLoadSetting {
    public static final boolean DEFAULT = false;
    public static final PortalLottieAsyncLoadSetting INSTANCE = new PortalLottieAsyncLoadSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_portal_push_into_lottie_async_load_enable", DEFAULT);
    }
}
