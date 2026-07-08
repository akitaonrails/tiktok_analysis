package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_component_disappear_check_duration")
public final class LiveMatchComponentDisappearCheckDurationSetting {
    public static final int DEFAULT = -1;
    public static final LiveMatchComponentDisappearCheckDurationSetting INSTANCE = new LiveMatchComponentDisappearCheckDurationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_match_component_disappear_check_duration", DEFAULT);
    }
}
