package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlivestreamer_access_velive_pusher")
public final class LiveAccessVeLivePusherSetting {
    public static final int DEFAULT = 0;
    public static final LiveAccessVeLivePusherSetting INSTANCE = new LiveAccessVeLivePusherSetting();

    public final boolean enableVelivePusher() {
        return SettingsManager.INSTANCE.getIntValue("ttlivestreamer_access_velive_pusher", DEFAULT) == 1;
    }
}
