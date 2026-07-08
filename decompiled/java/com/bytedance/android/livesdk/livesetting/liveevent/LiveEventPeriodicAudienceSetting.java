package com.bytedance.android.livesdk.livesetting.liveevent;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_event_periodic_audience")
public final class LiveEventPeriodicAudienceSetting {
    public static final int DEFAULT = 0;
    public static final LiveEventPeriodicAudienceSetting INSTANCE = new LiveEventPeriodicAudienceSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_event_periodic_audience", DEFAULT) == 1;
    }
}
