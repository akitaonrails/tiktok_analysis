package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_audience_multi_guest_reservation")
public final class LinkmicAudienceMultiGuestReservationSetting {
    public static final int DEFAULT = 0;
    public static final LinkmicAudienceMultiGuestReservationSetting INSTANCE = new LinkmicAudienceMultiGuestReservationSetting();
    public static final int RESERVE = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_audience_multi_guest_reservation", DEFAULT);
    }

    public final boolean isReserve() {
        return getValue() == 1;
    }
}
