package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_feed_preview_add_multi_guest_params")
public final class LiveSdkFeedPreviewAddMultiGuestParamsSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSdkFeedPreviewAddMultiGuestParamsSetting INSTANCE = new LiveSdkFeedPreviewAddMultiGuestParamsSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_feed_preview_add_multi_guest_params", DEFAULT);
    }
}
