package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.PerformanceOpt;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_performance_collect_report_opt_v2")
public final class LivePerformanceOptSetting {
    public static final LivePerformanceOptSetting INSTANCE = new LivePerformanceOptSetting();
    public static int audienceGapTime = -1;
    public static int hostGapTime = -1;
    public static final PerformanceOpt DEFAULT = new PerformanceOpt();

    public final PerformanceOpt getValue() {
        return (PerformanceOpt) SettingsManager.INSTANCE.getValueSafely("live_performance_collect_report_opt_v2", DEFAULT);
    }

    public final int getAudienceGapTime() {
        return audienceGapTime;
    }

    public final int getHostGapTime() {
        return hostGapTime;
    }

    private final int getGapTime(boolean z) {
        int i = 0;
        if (z) {
            if (hostGapTime < 0) {
                PerformanceOpt value = getValue();
                if (value != null) {
                    i = value.hostGapTime;
                }
                hostGapTime = i;
            }
            return hostGapTime;
        }
        if (audienceGapTime < 0) {
            PerformanceOpt value2 = getValue();
            if (value2 != null) {
                i = value2.audienceGapTime;
            }
            audienceGapTime = i;
        }
        return audienceGapTime;
    }

    public final boolean isEnable(boolean z) {
        if (getGapTime(z) > 0) {
            return true;
        }
        return false;
    }

    public final void setAudienceGapTime(int i) {
        audienceGapTime = i;
    }

    public final void setHostGapTime(int i) {
        hostGapTime = i;
    }

    public final boolean checkMinInterval(boolean z, long j) {
        if (System.currentTimeMillis() - j > ((long) getGapTime(z)) * 1000) {
            return true;
        }
        return false;
    }
}
