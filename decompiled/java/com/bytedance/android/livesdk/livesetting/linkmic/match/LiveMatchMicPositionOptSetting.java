package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_mic_position_opt")
public final class LiveMatchMicPositionOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchMicPositionOptSetting INSTANCE = new LiveMatchMicPositionOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_mic_position_opt", DEFAULT);
    }
}
