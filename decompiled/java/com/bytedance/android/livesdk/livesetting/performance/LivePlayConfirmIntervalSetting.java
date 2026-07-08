package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_play_confirm_interval_setting")
public final class LivePlayConfirmIntervalSetting {
    public static final long DEFAULT = 3000;
    public static final LivePlayConfirmIntervalSetting INSTANCE = new LivePlayConfirmIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_play_confirm_interval_setting", DEFAULT);
    }
}
