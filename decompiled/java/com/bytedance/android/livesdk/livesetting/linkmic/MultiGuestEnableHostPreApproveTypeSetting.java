package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_anchor_pre_approve_type")
public final class MultiGuestEnableHostPreApproveTypeSetting {
    public static final int DEFAULT = 0;
    public static final int GRP_ONE = 1;
    public static final int GRP_TWO = 2;
    public static final MultiGuestEnableHostPreApproveTypeSetting INSTANCE = new MultiGuestEnableHostPreApproveTypeSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_anchor_pre_approve_type", DEFAULT) > 0;
    }

    public static final boolean isInGroupV1() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_anchor_pre_approve_type", DEFAULT) == 1;
    }

    public static final boolean isInGroupV2() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_anchor_pre_approve_type", DEFAULT) == 2;
    }
}
