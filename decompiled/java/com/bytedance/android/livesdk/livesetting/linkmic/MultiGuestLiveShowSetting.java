package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_live_show")
public final class MultiGuestLiveShowSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestLiveShowSetting INSTANCE = new MultiGuestLiveShowSetting();
    public static final int V1 = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestLiveShowSetting.class);
    }

    public final boolean isV1() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestLiveShowSetting.class) == 1;
    }
}
