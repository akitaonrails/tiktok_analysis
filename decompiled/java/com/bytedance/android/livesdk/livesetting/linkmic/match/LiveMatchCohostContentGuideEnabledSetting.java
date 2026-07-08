package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_cohost_content_guide_enabled")
public final class LiveMatchCohostContentGuideEnabledSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMatchCohostContentGuideEnabledSetting INSTANCE = new LiveMatchCohostContentGuideEnabledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_cohost_content_guide_enabled", DEFAULT);
    }
}
