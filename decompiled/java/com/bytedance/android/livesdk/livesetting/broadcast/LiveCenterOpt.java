package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_center_optimization")
public final class LiveCenterOpt {
    public static final int DEFAULT = 0;
    public static final LiveCenterOpt INSTANCE = new LiveCenterOpt();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_center_optimization", DEFAULT) == 1;
    }
}
