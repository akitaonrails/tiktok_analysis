package com.bytedance.android.livesdk.livesetting.liveevent;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_event_periodic_anchor")
public final class LiveEventPeriodicAnchorSetting {
    public static final int DEFAULT = 0;
    public static final LiveEventPeriodicAnchorSetting INSTANCE = new LiveEventPeriodicAnchorSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_event_periodic_anchor", DEFAULT) == 1;
    }
}
