package com.bytedance.android.livesdk.watch.memleak;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_mem_leak_detect")
public final class LiveMemLeakDetectSetting {
    public static final int DEFAULT = 1;
    public static final LiveMemLeakDetectSetting INSTANCE = new LiveMemLeakDetectSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_mem_leak_detect", DEFAULT);
    }

    public static final boolean isEnabled(int i) {
        if ((i & getValue()) != 0) {
            return true;
        }
        return false;
    }
}
