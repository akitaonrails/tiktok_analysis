package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_cohost_allow_quick_cohost_preference_match_layout")
public final class LiveCohostAllowQuickCohostPreferenceMatchLayoutSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCohostAllowQuickCohostPreferenceMatchLayoutSetting INSTANCE = new LiveCohostAllowQuickCohostPreferenceMatchLayoutSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_allow_quick_cohost_preference_match_layout", DEFAULT);
    }
}
