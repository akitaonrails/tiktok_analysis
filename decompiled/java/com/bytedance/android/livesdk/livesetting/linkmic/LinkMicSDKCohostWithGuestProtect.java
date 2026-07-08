package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_cohost_with_guest_protect")
public final class LinkMicSDKCohostWithGuestProtect {
    public static final boolean DEFAULT = true;
    public static final LinkMicSDKCohostWithGuestProtect INSTANCE = new LinkMicSDKCohostWithGuestProtect();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_sdk_cohost_with_guest_protect", DEFAULT);
    }
}
