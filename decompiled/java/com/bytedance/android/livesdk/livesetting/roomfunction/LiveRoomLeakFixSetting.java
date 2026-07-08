package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_room_leak_fix_enable")
public final class LiveRoomLeakFixSetting {
    public static final boolean DEFAULT = false;
    public static final LiveRoomLeakFixSetting INSTANCE = new LiveRoomLeakFixSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_room_leak_fix_enable", DEFAULT);
    }
}
