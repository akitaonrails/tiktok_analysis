package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("augur_mock_perf_score")
public final class LiveAugurMockPerfScore {
    public static final int DEFAULT = 0;
    public static final LiveAugurMockPerfScore INSTANCE = new LiveAugurMockPerfScore();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("augur_mock_perf_score", DEFAULT);
    }
}
