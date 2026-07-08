package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_ws_all_switch")
public final class LiveAnchorWsSwtich {
    public static final LiveAnchorWsSwtich INSTANCE = new LiveAnchorWsSwtich();
    public static final int DEFAULT = 1;
    public static int value = SettingsManager.INSTANCE.getIntValue("live_anchor_ws_all_switch", 1);

    public final boolean enable() {
        return value > 0;
    }
}
