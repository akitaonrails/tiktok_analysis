package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_cohost_ui_sei_opt")
public final class LiveCoHostUISeiOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveCoHostUISeiOptSetting INSTANCE = new LiveCoHostUISeiOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_ui_sei_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
