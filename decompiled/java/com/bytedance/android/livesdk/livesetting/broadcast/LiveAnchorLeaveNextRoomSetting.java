package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_anchor_leave_next_room_disable")
public final class LiveAnchorLeaveNextRoomSetting {
    public static final LiveAnchorLeaveConfig2 DEFAULT;
    public static final LiveAnchorLeaveNextRoomSetting INSTANCE = new LiveAnchorLeaveNextRoomSetting();
    public static final LiveAnchorLeaveConfig2 config;

    static {
        LiveAnchorLeaveConfig2 liveAnchorLeaveConfig2 = new LiveAnchorLeaveConfig2(false, 60000L);
        DEFAULT = liveAnchorLeaveConfig2;
        config = (LiveAnchorLeaveConfig2) SettingsManager.INSTANCE.getValueSafely("live_anchor_leave_next_room_disable", liveAnchorLeaveConfig2);
    }

    public final long anchorLeaveTime() {
        return config.getAnchorLeaveTime();
    }

    public final boolean enableLeaveOpt() {
        return config.getEnableLeaveOpt();
    }
}
