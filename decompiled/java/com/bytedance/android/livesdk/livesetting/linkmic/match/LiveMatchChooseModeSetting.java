package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_choose_mode_setting")
public final class LiveMatchChooseModeSetting {
    public static final int DEFAULT = 1;
    public static final LiveMatchChooseModeSetting INSTANCE = new LiveMatchChooseModeSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_match_choose_mode_setting", DEFAULT) == 1;
    }
}
