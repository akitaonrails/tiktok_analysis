package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_core_room_check")
public final class LiveCoreRoomCheckSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCoreRoomCheckSetting INSTANCE = new LiveCoreRoomCheckSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_core_room_check", DEFAULT);
    }
}
