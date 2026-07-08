package com.bytedance.android.livesdk.utils;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_cohost_when_guest_audience")
public final class LinkMicCohostWhenGuestAudienceSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicCohostWhenGuestAudienceSetting INSTANCE = new LinkMicCohostWhenGuestAudienceSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_cohost_when_guest_audience", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
