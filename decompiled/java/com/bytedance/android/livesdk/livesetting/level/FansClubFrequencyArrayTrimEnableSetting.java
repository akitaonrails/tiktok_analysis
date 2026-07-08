package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_frequency_array_trim_enable")
public final class FansClubFrequencyArrayTrimEnableSetting {
    public static final boolean DEFAULT = true;
    public static final FansClubFrequencyArrayTrimEnableSetting INSTANCE = new FansClubFrequencyArrayTrimEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_frequency_array_trim_enable", DEFAULT);
    }
}
