package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_hangout_toplive_revert")
public final class MultiGuestHangoutTopliveRevertSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestHangoutTopliveRevertSetting INSTANCE = new MultiGuestHangoutTopliveRevertSetting();
    public static final int REVERT = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_hangout_toplive_revert", DEFAULT);
    }

    public final boolean isRevert() {
        return getValue() == 1;
    }
}
