package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_cohost_max_guest_count")
public final class LinkMicCoHostMaxGuestCountSetting {
    public static final int DEFAULT = 2;
    public static final LinkMicCoHostMaxGuestCountSetting INSTANCE = new LinkMicCoHostMaxGuestCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_cohost_max_guest_count", DEFAULT);
    }
}
