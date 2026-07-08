package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_enable_thread_priority_opt")
public final class TTLHEnableThreadPrioritySettings {
    public static final TTLHEnableThreadPrioritySettings INSTANCE = new TTLHEnableThreadPrioritySettings();
    public static final int DEFAULT = 1;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_enable_thread_priority_opt", DEFAULT) == 1;
    }
}
