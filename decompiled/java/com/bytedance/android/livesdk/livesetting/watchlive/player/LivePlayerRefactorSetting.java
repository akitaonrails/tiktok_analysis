package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_player_refactor_setting")
public final class LivePlayerRefactorSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLE_SWITCH_TO_MEDIA_BOX = 1;
    public static final LivePlayerRefactorSetting INSTANCE = new LivePlayerRefactorSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_player_refactor_setting", DEFAULT);
    }

    public final boolean enableSwitchToMediaBox() {
        return 1 == getValue();
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
