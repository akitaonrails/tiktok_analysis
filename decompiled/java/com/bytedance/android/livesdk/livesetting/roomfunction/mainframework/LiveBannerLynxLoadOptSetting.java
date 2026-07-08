package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_banner_lynx_load_optimize")
public final class LiveBannerLynxLoadOptSetting {
    public static final LiveBannerLynxLoadOptSetting INSTANCE = new LiveBannerLynxLoadOptSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_banner_lynx_load_optimize", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
