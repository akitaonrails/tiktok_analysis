package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_broadcast_log_block_opt")
public final class LiveBroadcastLogBlockOpt {
    public static final int DEFAULT = 0;
    public static final LiveBroadcastLogBlockOpt INSTANCE = new LiveBroadcastLogBlockOpt();

    public static final boolean isStrategy1() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_log_block_opt", DEFAULT) == 1;
    }

    public static final boolean isStrategy2() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_log_block_opt", DEFAULT) == 2;
    }

    public static final boolean enable() {
        return isStrategy1() || isStrategy2();
    }
}
