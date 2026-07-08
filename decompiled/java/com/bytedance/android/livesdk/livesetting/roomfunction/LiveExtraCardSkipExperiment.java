package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_extra_card_skip_check")
public final class LiveExtraCardSkipExperiment {
    public static final boolean DEFAULT = false;
    public static final LiveExtraCardSkipExperiment INSTANCE = new LiveExtraCardSkipExperiment();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_extra_card_skip_check", DEFAULT);
    }
}
