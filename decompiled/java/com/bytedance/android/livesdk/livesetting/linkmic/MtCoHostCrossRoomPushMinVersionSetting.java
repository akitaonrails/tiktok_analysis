package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_cross_room_push_arch_min_version")
public final class MtCoHostCrossRoomPushMinVersionSetting {
    public static final int DEFAULT = 2790;
    public static final MtCoHostCrossRoomPushMinVersionSetting INSTANCE = new MtCoHostCrossRoomPushMinVersionSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_cross_room_push_arch_min_version", DEFAULT);
    }
}
