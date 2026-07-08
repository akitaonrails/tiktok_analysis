package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_send_gift_to_all_threshold")
public final class MultiGuestSendGiftToAllThresholdSetting {
    public static final int DEFAULT = 3;
    public static final MultiGuestSendGiftToAllThresholdSetting INSTANCE = new MultiGuestSendGiftToAllThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_send_gift_to_all_threshold", DEFAULT);
    }
}
