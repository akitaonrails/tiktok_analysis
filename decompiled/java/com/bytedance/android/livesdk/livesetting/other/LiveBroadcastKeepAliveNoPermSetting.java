package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_broadcast_keep_alive_no_perm")
public final class LiveBroadcastKeepAliveNoPermSetting {
    public static final boolean DEFAULT = false;
    public static final LiveBroadcastKeepAliveNoPermSetting INSTANCE = new LiveBroadcastKeepAliveNoPermSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_broadcast_keep_alive_no_perm", DEFAULT);
    }
}
