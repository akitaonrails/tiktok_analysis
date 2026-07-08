package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_simulation_anchor_id")
public final class LiveHostSimulateAnchorId {
    public static final String DEFAULT = "";
    public static final LiveHostSimulateAnchorId INSTANCE = new LiveHostSimulateAnchorId();

    public static final String value() {
        String stringValue = SettingsManager.INSTANCE.getStringValue("live_simulation_anchor_id", DEFAULT);
        return stringValue == null ? "" : stringValue;
    }
}
