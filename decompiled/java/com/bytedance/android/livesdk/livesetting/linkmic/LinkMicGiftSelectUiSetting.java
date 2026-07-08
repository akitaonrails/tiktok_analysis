package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_gift_recipient_user_ui_ab")
public final class LinkMicGiftSelectUiSetting {
    public static final int DEFAULT = 0;
    public static final LinkMicGiftSelectUiSetting INSTANCE = new LinkMicGiftSelectUiSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_gift_recipient_user_ui_ab", DEFAULT);
    }

    public final boolean isV0(boolean z, boolean z2) {
        if (getValue() != 0 && !z && !z2) {
            return false;
        }
        return true;
    }

    public final boolean isV1(boolean z, boolean z2) {
        if (getValue() == 1 && !z && !z2) {
            return true;
        }
        return false;
    }
}
