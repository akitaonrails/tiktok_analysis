package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_slide_applog_block_log")
public final class LiveSlideBlockLogDisableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSlideBlockLogDisableSetting INSTANCE = new LiveSlideBlockLogDisableSetting();

    public static final boolean disable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_slide_applog_block_log", DEFAULT);
    }
}
