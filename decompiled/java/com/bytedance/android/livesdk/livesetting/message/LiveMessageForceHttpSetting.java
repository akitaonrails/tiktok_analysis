package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_force_http")
public final class LiveMessageForceHttpSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMessageForceHttpSetting INSTANCE = new LiveMessageForceHttpSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_message_force_http", DEFAULT);
    }
}
