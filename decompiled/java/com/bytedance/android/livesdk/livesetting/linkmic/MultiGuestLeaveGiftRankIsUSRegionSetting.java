package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("multi_guest_gift_rank_is_us_region")
public final class MultiGuestLeaveGiftRankIsUSRegionSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestLeaveGiftRankIsUSRegionSetting INSTANCE = new MultiGuestLeaveGiftRankIsUSRegionSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_gift_rank_is_us_region", DEFAULT);
    }

    public final boolean isInUS() {
        return getValue();
    }
}
