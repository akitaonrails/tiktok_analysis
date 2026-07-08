package com.bytedance.android.livesdk.livesetting.skylight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_toplive_skylight_opt")
public final class LiveTopLiveSkylightOptSetting {
    public static final LiveTopLiveSkylightOptSetting INSTANCE = new LiveTopLiveSkylightOptSetting();
    public static final boolean DEFAULT = false;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_toplive_skylight_opt", DEFAULT);

    public final boolean getEnable() {
        return enable;
    }
}
