package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "top_live_pull_down_expand_threshold")
public final class TopLivePullDownExpandThresholdSetting {
    public static final int DEFAULT = 0;
    public static final TopLivePullDownExpandThresholdSetting INSTANCE = new TopLivePullDownExpandThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("top_live_pull_down_expand_threshold", DEFAULT);
    }
}
