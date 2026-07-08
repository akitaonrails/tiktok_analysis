package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_core_init_opt")
public final class LiveCoreInitOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveCoreInitOptSetting INSTANCE = new LiveCoreInitOptSetting();

    public final int liveCoreInitPriority() {
        return SettingsManager.INSTANCE.getIntValue("live_core_init_opt", DEFAULT);
    }
}
