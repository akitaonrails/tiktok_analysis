package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_cohost_mock_always_show_preference_hint")
public final class LiveCohostMockAlwaysShowPreferenceHintSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCohostMockAlwaysShowPreferenceHintSetting INSTANCE = new LiveCohostMockAlwaysShowPreferenceHintSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_mock_always_show_preference_hint", DEFAULT);
    }
}
