package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_slide_memory_leak_fix_setting")
public final class LiveSlideMemoryLeakFixSettingSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSlideMemoryLeakFixSettingSetting INSTANCE = new LiveSlideMemoryLeakFixSettingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_slide_memory_leak_fix_setting", DEFAULT);
    }
}
