package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_core_event_request_id")
public final class LiveCoreEventRequestIdSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCoreEventRequestIdSetting INSTANCE = new LiveCoreEventRequestIdSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_core_event_request_id", DEFAULT);
    }
}
