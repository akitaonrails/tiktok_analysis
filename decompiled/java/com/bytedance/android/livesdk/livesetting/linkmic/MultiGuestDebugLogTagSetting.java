package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "live_debug_log_tag")
public final class MultiGuestDebugLogTagSetting {
    public static final MultiGuestDebugLogTagSetting INSTANCE = new MultiGuestDebugLogTagSetting();
    public static final String[] DEFAULT = {"GuestShowdownLog"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_debug_log_tag", DEFAULT);
    }
}
