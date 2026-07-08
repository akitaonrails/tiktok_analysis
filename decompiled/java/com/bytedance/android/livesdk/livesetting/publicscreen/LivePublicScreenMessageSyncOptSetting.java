package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_message_sync_opt")
public final class LivePublicScreenMessageSyncOptSetting {
    public static final int DEFAULT = 0;
    public static final int DELAY_CALCULATE_CHECK_OPT = 2;
    public static final int DELAY_CHECK_OPT = 1;
    public static final LivePublicScreenMessageSyncOptSetting INSTANCE = new LivePublicScreenMessageSyncOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_public_screen_message_sync_opt", DEFAULT);
    }

    public final boolean delayCalculateAndCheckOpt() {
        return getValue() == 2;
    }

    public final boolean delayCheckOpt() {
        return getValue() == 1 || getValue() == 2;
    }
}
