package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_cross_session_reentrant_interval")
public final class LiveCoHostCrossSessionReentrantIntervalSetting {
    public static final int DEFAULT = 10;
    public static final LiveCoHostCrossSessionReentrantIntervalSetting INSTANCE = new LiveCoHostCrossSessionReentrantIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_cross_session_reentrant_interval", DEFAULT);
    }
}
