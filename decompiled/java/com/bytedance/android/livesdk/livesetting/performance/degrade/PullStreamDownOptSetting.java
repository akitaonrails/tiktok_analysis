package com.bytedance.android.livesdk.livesetting.performance.degrade;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes27.dex */
@SettingsKey("pull_stream_down_opt")
public final class PullStreamDownOptSetting {
    public static final int DEFAULT = 0;
    public static final PullStreamDownOptSetting INSTANCE = new PullStreamDownOptSetting();
    public static final int V1 = 1;
    public static final int V2 = 2;
    public static final int V3 = 3;

    public final int getEnable() {
        return SettingsManager.INSTANCE.getIntValue("pull_stream_down_opt", DEFAULT);
    }

    public final boolean isDowngradeALog() {
        return getEnable() == 1;
    }

    public final boolean isDowngradeAll() {
        return getEnable() == 3;
    }

    public final boolean isDowngradeAppMonitor() {
        return getEnable() == 2;
    }
}
