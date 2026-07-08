package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_featured_entrance_host")
public final class MultiGuestNewFeaturedAnchorAbSettings {
    public static final int DEFAULT = 0;
    public static final MultiGuestNewFeaturedAnchorAbSettings INSTANCE = new MultiGuestNewFeaturedAnchorAbSettings();

    public final boolean isAnchorEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_multi_guest_featured_entrance_host", DEFAULT) == 1;
    }
}
