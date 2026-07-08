package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_partnership_performance_sample")
public final class TtliveGamePartnershipPerformanceSample {
    public static final TtliveGamePartnershipPerformanceSample INSTANCE = new TtliveGamePartnershipPerformanceSample();
    public static final GamePartnershipPerformanceSample DEFAULT = new GamePartnershipPerformanceSample(false, 3);

    public final GamePartnershipPerformanceSample getValue() {
        return (GamePartnershipPerformanceSample) SettingsManager.INSTANCE.getValueSafely(TtliveGamePartnershipPerformanceSample.class);
    }

    public final boolean enabled() {
        GamePartnershipPerformanceSample value = getValue();
        if (value == null) {
            value = DEFAULT;
        }
        return value.open;
    }

    public final int interval() {
        GamePartnershipPerformanceSample value = getValue();
        if (value == null) {
            value = DEFAULT;
        }
        return value.interval;
    }
}
