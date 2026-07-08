package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscription_sub_only_long_duration_preview_dolphin_setting")
public final class LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting INSTANCE = new LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting();

    public static final boolean getEnableLongPreview() {
        return INSTANCE.getValue();
    }

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_subscription_sub_only_long_duration_preview_dolphin_setting", DEFAULT);
    }
}
