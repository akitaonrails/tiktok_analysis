package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_enable_save_orientation")
public final class TtliveGameEnableSaveOrientationSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final TtliveGameEnableSaveOrientationSetting INSTANCE = new TtliveGameEnableSaveOrientationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_enable_save_orientation", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
