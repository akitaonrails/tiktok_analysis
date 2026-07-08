package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_mock_force_matched_preference_tag")
public final class LiveCohostMockForceMatchedPreferenceTagSetting {
    public static final int DEFAULT = 0;
    public static final LiveCohostMockForceMatchedPreferenceTagSetting INSTANCE = new LiveCohostMockForceMatchedPreferenceTagSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_mock_force_matched_preference_tag", DEFAULT);
    }
}
