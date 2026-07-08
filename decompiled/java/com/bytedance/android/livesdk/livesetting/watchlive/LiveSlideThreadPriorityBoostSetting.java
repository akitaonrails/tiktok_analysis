package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_slide_thread_priority_boost")
public final class LiveSlideThreadPriorityBoostSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSlideThreadPriorityBoostSetting INSTANCE = new LiveSlideThreadPriorityBoostSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_slide_thread_priority_boost", DEFAULT);
    }
}
