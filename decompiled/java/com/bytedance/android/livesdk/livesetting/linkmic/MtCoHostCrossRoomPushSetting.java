package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_cross_room_push_arch_enable")
public final class MtCoHostCrossRoomPushSetting {
    public static final int DEFAULT = 0;
    public static final MtCoHostCrossRoomPushSetting INSTANCE = new MtCoHostCrossRoomPushSetting();

    public static final boolean isEnable() {
        return INSTANCE.getValue() == 1 || MtLinkMicRustCohostAnchorSetting.isLinkerEnable() || MtLinkMicRustCohostAudienceSetting.isLinkerEnable();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_cross_room_push_arch_enable", DEFAULT);
    }
}
