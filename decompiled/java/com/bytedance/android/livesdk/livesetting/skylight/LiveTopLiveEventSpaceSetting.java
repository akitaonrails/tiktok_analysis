package com.bytedance.android.livesdk.livesetting.skylight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_toplive_event_space_setting")
public final class LiveTopLiveEventSpaceSetting {
    public static final LiveTopLiveEventSpaceSetting INSTANCE = new LiveTopLiveEventSpaceSetting();
    public static final boolean DEFAULT = false;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_toplive_event_space_setting", DEFAULT);

    public final boolean getEnable() {
        return enable;
    }
}
