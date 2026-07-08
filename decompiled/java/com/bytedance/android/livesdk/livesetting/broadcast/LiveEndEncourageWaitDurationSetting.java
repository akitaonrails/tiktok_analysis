package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_end_encourage_wait_duration")
public final class LiveEndEncourageWaitDurationSetting {
    public static final int DEFAULT = 6;
    public static final LiveEndEncourageWaitDurationSetting INSTANCE = new LiveEndEncourageWaitDurationSetting();

    public final int duration() {
        return SettingsManager.INSTANCE.getIntValue("live_end_encourage_wait_duration", DEFAULT);
    }
}
