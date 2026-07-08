package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_top_live_enable_random_match")
public final class MultiTopLiveEnableRandomMatchSetting {
    public static final boolean DEFAULT = true;
    public static final MultiTopLiveEnableRandomMatchSetting INSTANCE = new MultiTopLiveEnableRandomMatchSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_top_live_enable_random_match", DEFAULT);
    }
}
