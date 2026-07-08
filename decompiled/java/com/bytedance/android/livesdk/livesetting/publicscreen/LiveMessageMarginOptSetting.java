package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_message_margin_opt")
public final class LiveMessageMarginOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMessageMarginOptSetting INSTANCE = new LiveMessageMarginOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_message_margin_opt", DEFAULT);
    }
}
