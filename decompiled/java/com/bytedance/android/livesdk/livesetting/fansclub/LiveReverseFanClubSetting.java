package com.bytedance.android.livesdk.livesetting.fansclub;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "fans_club_reverse_experiment")
public final class LiveReverseFanClubSetting {
    public static final boolean DEFAULT = false;
    public static final LiveReverseFanClubSetting INSTANCE = new LiveReverseFanClubSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("fans_club_reverse_experiment", DEFAULT);
    }
}
