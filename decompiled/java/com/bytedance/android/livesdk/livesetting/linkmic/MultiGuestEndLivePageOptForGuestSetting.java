package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_end_live_page_opt_for_guest")
public final class MultiGuestEndLivePageOptForGuestSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestEndLivePageOptForGuestSetting INSTANCE = new MultiGuestEndLivePageOptForGuestSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_end_live_page_opt_for_guest", DEFAULT);
    }
}
