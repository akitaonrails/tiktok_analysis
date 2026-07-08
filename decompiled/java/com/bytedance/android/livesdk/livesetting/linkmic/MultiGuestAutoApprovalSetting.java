package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_auto_approval")
public final class MultiGuestAutoApprovalSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestAutoApprovalSetting INSTANCE = new MultiGuestAutoApprovalSetting();
    public static final int V1 = 1;
    public static final int V2 = 2;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_auto_approval", DEFAULT);
    }

    public final boolean enable() {
        return getValue() == 1 || getValue() == 2;
    }

    public final boolean isOptAllowUserReqUI() {
        return getValue() == 1;
    }
}
