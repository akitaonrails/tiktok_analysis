package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_player_layout_should_fill")
public final class LivePlayerLayoutShouldFillSetting {
    public static final LivePlayerLayoutShouldFillSetting INSTANCE = new LivePlayerLayoutShouldFillSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_player_layout_should_fill", DEFAULT);
    }
}
