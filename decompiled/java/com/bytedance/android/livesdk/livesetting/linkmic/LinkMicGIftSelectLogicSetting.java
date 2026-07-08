package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_gift_recipient_def_logic_ab")
public final class LinkMicGIftSelectLogicSetting {
    public static final int DEFAULT = 0;
    public static final LinkMicGIftSelectLogicSetting INSTANCE = new LinkMicGIftSelectLogicSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_gift_recipient_def_logic_ab", DEFAULT);
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

    public final boolean isV2(boolean z, boolean z2) {
        if (getValue() == 2 && !z && !z2) {
            return true;
        }
        return false;
    }
}
