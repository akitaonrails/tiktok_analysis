package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_broadcast_session_id_setting")
public final class LiveBroadcastSessionIdSetting {
    public static final boolean DEFAULT = true;
    public static final LiveBroadcastSessionIdSetting INSTANCE = new LiveBroadcastSessionIdSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_broadcast_session_id_setting", DEFAULT);
    }
}
