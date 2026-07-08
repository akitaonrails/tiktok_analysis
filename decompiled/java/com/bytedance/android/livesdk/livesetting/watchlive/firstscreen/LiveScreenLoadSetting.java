package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = true, value = "screen_success_rate_exp")
public final class LiveScreenLoadSetting {
    public static final boolean DEFAULT = false;
    public static final LiveScreenLoadSetting INSTANCE = new LiveScreenLoadSetting();

    public final boolean enablePrePullByPredict() {
        return SettingsManager.INSTANCE.getBooleanValue("screen_success_rate_exp", DEFAULT);
    }
}
