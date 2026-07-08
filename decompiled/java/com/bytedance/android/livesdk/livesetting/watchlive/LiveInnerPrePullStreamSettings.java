package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inner_pre_pull_stream")
public final class LiveInnerPrePullStreamSettings {
    public static final LiveInnerPrePullStreamSettings INSTANCE = new LiveInnerPrePullStreamSettings();
    public static final LiveInnerPrePullStreamConfigData DEFAULT = new LiveInnerPrePullStreamConfigData(-1, -1, -1, -1);

    public final LiveInnerPrePullStreamConfigData getValue() {
        return (LiveInnerPrePullStreamConfigData) SettingsManager.INSTANCE.getValueSafely("live_inner_pre_pull_stream", DEFAULT);
    }

    public final LiveInnerPrePullStreamConfigData getDEFAULT() {
        return DEFAULT;
    }
}
