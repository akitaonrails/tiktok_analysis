package com.bytedance.android.livesdk.utils;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_cohost_when_guest_anchor")
public final class LinkMicCohostWhenGuestAnchorSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicCohostWhenGuestAnchorSetting INSTANCE = new LinkMicCohostWhenGuestAnchorSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_cohost_when_guest_anchor", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
