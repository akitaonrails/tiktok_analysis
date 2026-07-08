package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_frequency_array_trim_config")
public final class FansClubFrequencyArrayTrimConfigSetting {
    public static final FansClubFrequencyArrayTrimConfigSetting INSTANCE = new FansClubFrequencyArrayTrimConfigSetting();
    public static final TrimConfig DEFAULT = new TrimConfig(100, 20);

    public final TrimConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        TrimConfig trimConfig = DEFAULT;
        TrimConfig trimConfig2 = (TrimConfig) settingsManager.getValueSafely("live_fans_club_frequency_array_trim_config", trimConfig);
        return trimConfig2 != null ? trimConfig2 : trimConfig;
    }

    public final int getKeepCount() {
        Integer numValueOf = Integer.valueOf(getConfig().keepCount);
        return numValueOf.intValue() > 0 ? numValueOf.intValue() : DEFAULT.keepCount;
    }

    public final int getThreshold() {
        Integer numValueOf = Integer.valueOf(getConfig().threshold);
        return numValueOf.intValue() > 0 ? numValueOf.intValue() : DEFAULT.threshold;
    }

    public final TrimConfig getDEFAULT() {
        return DEFAULT;
    }
}
