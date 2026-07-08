package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("audience_is_cohost_during_multiguest_enabled")
public final class AudienceIsCohostDuringMultiGuestEnabled {
    public static final boolean DEFAULT = true;
    public static final AudienceIsCohostDuringMultiGuestEnabled INSTANCE = new AudienceIsCohostDuringMultiGuestEnabled();

    public static final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("audience_is_cohost_during_multiguest_enabled", DEFAULT);
    }
}
