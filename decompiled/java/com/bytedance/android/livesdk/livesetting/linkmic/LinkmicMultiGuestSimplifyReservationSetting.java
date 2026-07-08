package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_multi_guest_simplify_reservation")
public final class LinkmicMultiGuestSimplifyReservationSetting {
    public static final int DEFAULT = 0;
    public static final LinkmicMultiGuestSimplifyReservationSetting INSTANCE = new LinkmicMultiGuestSimplifyReservationSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_multi_guest_simplify_reservation", DEFAULT) != 0;
    }
}
