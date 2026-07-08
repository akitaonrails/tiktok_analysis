package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_feed_no_guest_mask_fix")
public final class MultiGuestFeedNoGuestMaskFixSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestFeedNoGuestMaskFixSetting INSTANCE = new MultiGuestFeedNoGuestMaskFixSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_feed_no_guest_mask_fix", DEFAULT);
    }
}
