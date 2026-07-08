package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_enable_live_journey_task_report")
public final class LiveEnableLiveJourneyTaskReport {
    public static final boolean DEFAULT = false;
    public static final LiveEnableLiveJourneyTaskReport INSTANCE = new LiveEnableLiveJourneyTaskReport();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_enable_live_journey_task_report", DEFAULT);
    }
}
