package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_interact_view_request_layout_opt_setting")
public final class LiveInteractViewRequestLayoutOptSetting {
    public static final LiveInteractViewRequestLayoutOptSetting INSTANCE = new LiveInteractViewRequestLayoutOptSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_interact_view_request_layout_opt_setting", DEFAULT);

    public final boolean enableGestureOpt() {
        return value;
    }
}
