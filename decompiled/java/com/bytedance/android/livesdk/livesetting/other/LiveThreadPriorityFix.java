package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "live_thread_priority_fix")
public final class LiveThreadPriorityFix {
    public static final boolean DEFAULT = false;
    public static final LiveThreadPriorityFix INSTANCE = new LiveThreadPriorityFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_thread_priority_fix", DEFAULT);
    }
}
