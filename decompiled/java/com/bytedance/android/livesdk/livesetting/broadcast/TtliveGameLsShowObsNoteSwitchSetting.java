package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_ls_show_obs_note_switch")
public final class TtliveGameLsShowObsNoteSwitchSetting {
    public static final int DEFAULT = 0;
    public static final TtliveGameLsShowObsNoteSwitchSetting INSTANCE = new TtliveGameLsShowObsNoteSwitchSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_ls_show_obs_note_switch", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
