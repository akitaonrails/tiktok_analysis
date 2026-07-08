package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_and_co_host_add_age")
public final class LiveHostAndCoHostAddAgeSetting {
    public static final int DEFAULT = 0;
    public static final LiveHostAndCoHostAddAgeSetting INSTANCE = new LiveHostAndCoHostAddAgeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_host_and_co_host_add_age", DEFAULT);
    }
}
