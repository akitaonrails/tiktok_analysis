package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_remove_extra_check")
public final class LivePublicScreenRemoveExtraCheckSetting {
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenRemoveExtraCheckSetting INSTANCE = new LivePublicScreenRemoveExtraCheckSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_public_screen_remove_extra_check", DEFAULT);
    }
}
