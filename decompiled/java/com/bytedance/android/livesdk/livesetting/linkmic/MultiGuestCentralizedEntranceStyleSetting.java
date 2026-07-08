package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_centralized_entrance_style")
public final class MultiGuestCentralizedEntranceStyleSetting {
    public static final int DEFAULT = 0;
    public static final int GRP_THREE = 3;
    public static final MultiGuestCentralizedEntranceStyleSetting INSTANCE = new MultiGuestCentralizedEntranceStyleSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_centralized_entrance_style", DEFAULT);
    }

    public final boolean hangoutEnable() {
        return getValue() == 3 && !MultiGuestHangoutTopliveRevertSetting.INSTANCE.isRevert();
    }
}
