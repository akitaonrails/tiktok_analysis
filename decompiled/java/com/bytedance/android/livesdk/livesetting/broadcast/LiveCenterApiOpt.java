package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_center_api_opt")
public final class LiveCenterApiOpt {
    public static final int DEFAULT = 0;
    public static final LiveCenterApiOpt INSTANCE = new LiveCenterApiOpt();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_center_api_opt", DEFAULT) == 1;
    }
}
