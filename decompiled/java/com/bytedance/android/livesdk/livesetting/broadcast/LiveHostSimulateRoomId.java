package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_simulation_room_id")
public final class LiveHostSimulateRoomId {
    public static final String DEFAULT = "";
    public static final LiveHostSimulateRoomId INSTANCE = new LiveHostSimulateRoomId();

    public static final String value() {
        String stringValue = SettingsManager.INSTANCE.getStringValue("live_simulation_room_id", DEFAULT);
        return stringValue == null ? "" : stringValue;
    }
}
