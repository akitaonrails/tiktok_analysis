package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_broadcast_try_mode_close_setting")
public final class LiveBroadcastTryModeCloseSetting {
    public static final boolean DEFAULT = true;
    public static final LiveBroadcastTryModeCloseSetting INSTANCE = new LiveBroadcastTryModeCloseSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_broadcast_try_mode_close_setting", DEFAULT);
    }
}
