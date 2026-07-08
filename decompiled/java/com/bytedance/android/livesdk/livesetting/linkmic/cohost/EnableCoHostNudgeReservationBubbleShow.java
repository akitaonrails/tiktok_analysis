package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("enable_cohost_reservation_bubble_display")
public final class EnableCoHostNudgeReservationBubbleShow {
    public static final int DEFAULT = 1;
    public static final EnableCoHostNudgeReservationBubbleShow INSTANCE = new EnableCoHostNudgeReservationBubbleShow();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enable_cohost_reservation_bubble_display", DEFAULT);
    }
}
