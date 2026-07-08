package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_user_manager_reservation_fix")
public final class LinkmicUserManagerReservationFixSetting {
    public static final boolean DEFAULT = true;
    public static final LinkmicUserManagerReservationFixSetting INSTANCE = new LinkmicUserManagerReservationFixSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkmicUserManagerReservationFixSetting.class);
    }
}
