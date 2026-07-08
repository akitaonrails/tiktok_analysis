package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlivestreamer_access_velive_pusher_v2")
public final class LiveAccessVeLivePusherSettingV2 {
    public static final int DEFAULT = 0;
    public static final LiveAccessVeLivePusherSettingV2 INSTANCE = new LiveAccessVeLivePusherSettingV2();

    public final boolean enableVelivePusherV2() {
        return SettingsManager.INSTANCE.getIntValue("ttlivestreamer_access_velive_pusher_v2", DEFAULT) == 1;
    }
}
