package com.bytedance.android.livesdk.livesetting.liveevent;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_event_create_from_group_enable")
public final class LiveEventCreateFromGroupEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEventCreateFromGroupEnableSetting INSTANCE = new LiveEventCreateFromGroupEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_event_create_from_group_enable", DEFAULT);
    }
}
