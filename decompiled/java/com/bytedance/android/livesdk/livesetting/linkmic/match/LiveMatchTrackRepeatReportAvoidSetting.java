package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("battle_clickable_switch")
public final class LiveMatchTrackRepeatReportAvoidSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchTrackRepeatReportAvoidSetting INSTANCE = new LiveMatchTrackRepeatReportAvoidSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("battle_clickable_switch", DEFAULT);
    }
}
