package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_mt_tikcast_switcher_param")
public final class LiveMtTikcastSwitcherParamSetting {
    public static final int DEFAULT = 0;
    public static final LiveMtTikcastSwitcherParamSetting INSTANCE = new LiveMtTikcastSwitcherParamSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_mt_tikcast_switcher_param", DEFAULT);
    }
}
