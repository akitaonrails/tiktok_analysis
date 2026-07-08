package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_mix_card_event_config")
public final class LiveMixCardEventConfig {
    public static final LiveMixCardEventConfig INSTANCE = new LiveMixCardEventConfig();
    public static final Map<String, Double> DEFAULT = C2097608Jq.LJ();

    private final Map<String, Double> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, Double> map = DEFAULT;
        Map<String, Double> map2 = (Map) settingsManager.getValueSafely("live_mix_card_event_config", map);
        return map2 != null ? map2 : map;
    }

    public final long getDegradeControlDuration() {
        Double d = getValue().get("degrade_control_duration");
        if (d == null) {
            d = 720;
        }
        return d.longValue();
    }

    public final long getDegradeTimes() {
        Double d = getValue().get("degrade_times");
        if (d == null) {
            d = 3;
        }
        return d.longValue();
    }

    public final long getFrequencyControlDuration() {
        Double d = getValue().get("frequency_control_duration");
        if (d == null) {
            d = 72L;
        }
        return d.longValue();
    }

    public final long getWithdrawTimes() {
        Double d = getValue().get("withdraw_times");
        if (d == null) {
            d = 5;
        }
        return d.longValue();
    }

    public final Map<String, Double> getDEFAULT() {
        return DEFAULT;
    }
}
