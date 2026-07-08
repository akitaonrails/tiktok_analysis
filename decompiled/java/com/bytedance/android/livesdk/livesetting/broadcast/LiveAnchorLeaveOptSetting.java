package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("broadcast_anchor_leave_opt")
public final class LiveAnchorLeaveOptSetting {
    public static final LiveAnchorLeaveConfig DEFAULT;
    public static final LiveAnchorLeaveOptSetting INSTANCE = new LiveAnchorLeaveOptSetting();
    public static final LiveAnchorLeaveConfig config;

    static {
        LiveAnchorLeaveConfig liveAnchorLeaveConfig = new LiveAnchorLeaveConfig(false, 60000L);
        DEFAULT = liveAnchorLeaveConfig;
        config = (LiveAnchorLeaveConfig) SettingsManager.INSTANCE.getValueSafely("broadcast_anchor_leave_opt", liveAnchorLeaveConfig);
    }

    public final long anchorLeaveTime() {
        return config.getAnchorLeaveTime();
    }

    public final boolean enableLeaveOpt() {
        return config.getEnableLeaveOpt();
    }
}
