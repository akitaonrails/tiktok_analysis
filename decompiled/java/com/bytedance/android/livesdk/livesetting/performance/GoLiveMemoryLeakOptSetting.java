package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("go_live_memory_leak_opt")
public final class GoLiveMemoryLeakOptSetting {
    public static final int DEFAULT = 0;
    public static final GoLiveMemoryLeakOptSetting INSTANCE = new GoLiveMemoryLeakOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("go_live_memory_leak_opt", DEFAULT) == 1;
    }
}
