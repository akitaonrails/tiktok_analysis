package com.bytedance.android.livesdk.livesetting.other;

import X.C486960J7u;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey("live_settings_write_delay_time")
public final class LiveSettingsWriteDelayTimeSetting {
    public static final long DEFAULT = 500;
    public static final LiveSettingsWriteDelayTimeSetting INSTANCE = new LiveSettingsWriteDelayTimeSetting();

    public final long getValue() {
        if (C486960J7u.LIZ()) {
            return 800L;
        }
        return SettingsManager.INSTANCE.getLongValue("live_settings_write_delay_time", DEFAULT);
    }
}
