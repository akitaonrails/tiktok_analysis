package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_cohost_cross_session_active_opt")
public final class LiveCoHostCrossSessionActiveOptSetting {
    public static final int DEFAULT = 1;
    public static final LiveCoHostCrossSessionActiveOptSetting INSTANCE = new LiveCoHostCrossSessionActiveOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_cross_session_active_opt", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
