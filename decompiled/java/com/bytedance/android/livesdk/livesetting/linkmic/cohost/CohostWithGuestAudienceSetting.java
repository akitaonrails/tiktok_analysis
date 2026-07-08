package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_audience_enabled")
public final class CohostWithGuestAudienceSetting {
    public static final boolean DEFAULT = true;
    public static final CohostWithGuestAudienceSetting INSTANCE = new CohostWithGuestAudienceSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_with_guest_audience_enabled", DEFAULT);
    }
}
