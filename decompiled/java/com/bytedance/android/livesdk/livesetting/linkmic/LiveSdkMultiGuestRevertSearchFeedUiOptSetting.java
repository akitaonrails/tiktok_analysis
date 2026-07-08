package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_revert_search_feed_ui_opt")
public final class LiveSdkMultiGuestRevertSearchFeedUiOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiGuestRevertSearchFeedUiOptSetting INSTANCE = new LiveSdkMultiGuestRevertSearchFeedUiOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_multi_guest_revert_search_feed_ui_opt", DEFAULT);
    }
}
