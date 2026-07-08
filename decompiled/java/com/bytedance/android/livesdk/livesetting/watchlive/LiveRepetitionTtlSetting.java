package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.LiveRepetitionTtlConfig;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_repetition_show_ttl")
public final class LiveRepetitionTtlSetting {
    public static final LiveRepetitionTtlSetting INSTANCE = new LiveRepetitionTtlSetting();
    public static final LiveRepetitionTtlConfig DEFAULT = new LiveRepetitionTtlConfig();

    public final LiveRepetitionTtlConfig getValue() {
        LiveRepetitionTtlConfig liveRepetitionTtlConfig = (LiveRepetitionTtlConfig) SettingsManager.INSTANCE.getValueSafely(LiveRepetitionTtlSetting.class);
        return liveRepetitionTtlConfig == null ? DEFAULT : liveRepetitionTtlConfig;
    }
}
