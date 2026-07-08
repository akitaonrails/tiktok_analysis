package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "profile_live_entrance_experiment")
public final class ProfileLiveEntranceExperiment {
    public static final boolean DEFAULT = false;
    public static final ProfileLiveEntranceExperiment INSTANCE = new ProfileLiveEntranceExperiment();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("profile_live_entrance_experiment", DEFAULT);
    }
}
