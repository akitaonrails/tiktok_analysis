package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_persist_manual_result")
public final class TtliveGameSpeedTestPersistManualSetting {
    public static final String DEFAULT = "";
    public static final TtliveGameSpeedTestPersistManualSetting INSTANCE = new TtliveGameSpeedTestPersistManualSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("ttlive_game_persist_manual_result", DEFAULT);
    }
}
