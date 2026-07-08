package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_linkmic_preview_count_down_time")
public final class LinkMicMultiGuestPreviewCountDownTimeSetting {
    public static final int DEFAULT = 5;
    public static final LinkMicMultiGuestPreviewCountDownTimeSetting INSTANCE = new LinkMicMultiGuestPreviewCountDownTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_linkmic_preview_count_down_time", DEFAULT);
    }
}
