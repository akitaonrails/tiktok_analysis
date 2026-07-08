package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_fix_jump_setting")
public final class LiveMatchFixJumpSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchFixJumpSetting INSTANCE = new LiveMatchFixJumpSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_fix_jump_setting", DEFAULT);
    }
}
