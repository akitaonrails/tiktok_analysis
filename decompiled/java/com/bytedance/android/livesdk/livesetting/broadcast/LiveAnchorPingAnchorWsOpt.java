package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_link_change_state_time")
public final class LiveAnchorPingAnchorWsOpt {
    public static final LiveAnchorPingAnchorWsOpt INSTANCE = new LiveAnchorPingAnchorWsOpt();
    public static final int DEFAULT = 0;
    public static int value = SettingsManager.INSTANCE.getIntValue("live_link_change_state_time", DEFAULT);
}
