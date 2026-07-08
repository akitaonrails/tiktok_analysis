package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_remove_old_speedtest")
public final class LiveAnchorRemoveSpeedTestSwitch {
    public static final int DEFAULT = 1;
    public static final LiveAnchorRemoveSpeedTestSwitch INSTANCE = new LiveAnchorRemoveSpeedTestSwitch();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_remove_old_speedtest", DEFAULT);
    }

    public final boolean enable() {
        return getValue() > 0;
    }
}
