package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_enable_guest_invite_optimize")
public final class MultiGuestGuestManagePanelOptSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestGuestManagePanelOptSetting INSTANCE = new MultiGuestGuestManagePanelOptSetting();
    public static final int V1 = 1;
    public static final int V2 = 2;

    public static final boolean isInviteEnhanceEnabled() {
        return INSTANCE.value() == 2;
    }

    public static final boolean isNewPanelEnabled() {
        return INSTANCE.value() >= 1;
    }

    public static final boolean isV1() {
        return INSTANCE.value() == 1;
    }

    public static final boolean isV2() {
        return INSTANCE.value() == 2;
    }

    private final int value() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_enable_guest_invite_optimize", DEFAULT);
    }
}
