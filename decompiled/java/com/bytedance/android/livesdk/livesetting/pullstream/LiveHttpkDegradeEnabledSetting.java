package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_httpk_degrade_enabled")
public final class LiveHttpkDegradeEnabledSetting {
    public static final boolean DEFAULT = false;
    public static final LiveHttpkDegradeEnabledSetting INSTANCE = new LiveHttpkDegradeEnabledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_httpk_degrade_enabled", DEFAULT);
    }
}
