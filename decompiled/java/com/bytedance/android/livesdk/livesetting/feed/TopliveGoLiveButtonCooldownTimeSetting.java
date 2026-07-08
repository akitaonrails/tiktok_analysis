package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "toplive_go_live_button_cooldown_time")
public final class TopliveGoLiveButtonCooldownTimeSetting {
    public static final int DEFAULT = 0;
    public static final TopliveGoLiveButtonCooldownTimeSetting INSTANCE = new TopliveGoLiveButtonCooldownTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("toplive_go_live_button_cooldown_time", DEFAULT);
    }
}
