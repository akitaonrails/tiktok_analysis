package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("multi_guest_audience_timeout_leave")
public final class MultiGuestV3GuestGoLivePreviewPanelPauseMaxTime {
    public static final int DEFAULT = 180;
    public static final MultiGuestV3GuestGoLivePreviewPanelPauseMaxTime INSTANCE = new MultiGuestV3GuestGoLivePreviewPanelPauseMaxTime();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_audience_timeout_leave", DEFAULT);
    }

    public final int getMiniutes() {
        return getValue() / 60;
    }
}
