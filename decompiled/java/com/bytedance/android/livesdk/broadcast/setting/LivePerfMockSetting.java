package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_perf_mock_setting")
public final class LivePerfMockSetting {
    public static final LivePerfMockSetting INSTANCE = new LivePerfMockSetting();
    public static final LivePerfMockData DEFAULT = new LivePerfMockData(false, 20, 6.5d, 30.0d);

    public final boolean getEnabled() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePerfMockData livePerfMockData = DEFAULT;
        LivePerfMockData livePerfMockData2 = (LivePerfMockData) settingsManager.getValueSafely("live_perf_mock_setting", livePerfMockData);
        if (livePerfMockData2 != null) {
            livePerfMockData = livePerfMockData2;
        }
        return livePerfMockData.enable;
    }

    public final double getEncodeFps() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePerfMockData livePerfMockData = DEFAULT;
        LivePerfMockData livePerfMockData2 = (LivePerfMockData) settingsManager.getValueSafely("live_perf_mock_setting", livePerfMockData);
        if (livePerfMockData2 != null) {
            livePerfMockData = livePerfMockData2;
        }
        return livePerfMockData.encodeFps;
    }

    public final double getOverallScore() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePerfMockData livePerfMockData = DEFAULT;
        LivePerfMockData livePerfMockData2 = (LivePerfMockData) settingsManager.getValueSafely("live_perf_mock_setting", livePerfMockData);
        if (livePerfMockData2 != null) {
            livePerfMockData = livePerfMockData2;
        }
        return livePerfMockData.overallScore;
    }

    public final int getPerfScore() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePerfMockData livePerfMockData = DEFAULT;
        LivePerfMockData livePerfMockData2 = (LivePerfMockData) settingsManager.getValueSafely("live_perf_mock_setting", livePerfMockData);
        if (livePerfMockData2 != null) {
            livePerfMockData = livePerfMockData2;
        }
        return livePerfMockData.perfScore;
    }
}
