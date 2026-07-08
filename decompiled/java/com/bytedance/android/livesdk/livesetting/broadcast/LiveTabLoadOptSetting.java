package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_tab_load_opt")
public final class LiveTabLoadOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveTabLoadOptSetting INSTANCE = new LiveTabLoadOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_tab_load_opt", DEFAULT) > 0;
    }

    public final boolean isV2() {
        return SettingsManager.INSTANCE.getIntValue("live_tab_load_opt", DEFAULT) == 2;
    }
}
