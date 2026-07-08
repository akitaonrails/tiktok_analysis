package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_continue_definition_null_opt")
public final class TtliveGameContinueDefinitionNullOptSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final TtliveGameContinueDefinitionNullOptSetting INSTANCE = new TtliveGameContinueDefinitionNullOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_continue_definition_null_opt", DEFAULT);
    }
}
