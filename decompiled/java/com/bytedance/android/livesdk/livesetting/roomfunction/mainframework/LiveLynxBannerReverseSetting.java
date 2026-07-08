package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_lynx_banner_reverse_setting")
public final class LiveLynxBannerReverseSetting {
    public static final boolean DEFAULT = false;
    public static final LiveLynxBannerReverseSetting INSTANCE = new LiveLynxBannerReverseSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_lynx_banner_reverse_setting", DEFAULT);
    }
}
