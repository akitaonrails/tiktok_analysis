package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_simulation_auto_start_message")
public final class LiveHostSimulateAutoStartMessage {
    public static final String DEFAULT = "1";
    public static final LiveHostSimulateAutoStartMessage INSTANCE = new LiveHostSimulateAutoStartMessage();
    public static int autoStartMessage = -1;

    public static /* synthetic */ void getAutoStartMessage$annotations() {
    }

    public static final Object value() {
        int i = autoStartMessage;
        if (i != -1) {
            return Integer.valueOf(i);
        }
        String stringValue = SettingsManager.INSTANCE.getStringValue("live_simulation_auto_start_message", DEFAULT);
        return stringValue == null ? "1" : stringValue;
    }

    public static final int getAutoStartMessage() {
        return autoStartMessage;
    }

    public static final void setAutoStartMessage(int i) {
        autoStartMessage = i;
    }
}
