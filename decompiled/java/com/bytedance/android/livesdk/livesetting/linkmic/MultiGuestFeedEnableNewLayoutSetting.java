package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_feed_enable_new_layout")
public final class MultiGuestFeedEnableNewLayoutSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestFeedEnableNewLayoutSetting INSTANCE = new MultiGuestFeedEnableNewLayoutSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_feed_enable_new_layout", DEFAULT) != 0;
    }
}
