package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_video_quality_api_prefetch")
public final class TtliveGameSpeedTestPreFetchSetting {
    public static final String DEFAULT = "";
    public static final TtliveGameSpeedTestPreFetchSetting INSTANCE = new TtliveGameSpeedTestPreFetchSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("ttlive_game_video_quality_api_prefetch", DEFAULT);
    }
}
