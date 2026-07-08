package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = true, value = "live_pip_resume_enable")
public final class LivePipResumeEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LivePipResumeEnableSetting INSTANCE = new LivePipResumeEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pip_resume_enable", DEFAULT);
    }
}
