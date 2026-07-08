package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_continue_use_local_orientation")
public final class TtliveGameContinueUseLocalOrientationSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final TtliveGameContinueUseLocalOrientationSetting INSTANCE = new TtliveGameContinueUseLocalOrientationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_continue_use_local_orientation", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
