package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_guest_cnt_tracking_setting")
public final class CohostWithGuestGuestCntTrackingSetting {
    public static final int DEFAULT = 0;
    public static final CohostWithGuestGuestCntTrackingSetting INSTANCE = new CohostWithGuestGuestCntTrackingSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("cohost_with_guest_guest_cnt_tracking_setting", DEFAULT);
    }

    public final boolean reportGuestCntInCohost() {
        return getValue() > 0;
    }
}
