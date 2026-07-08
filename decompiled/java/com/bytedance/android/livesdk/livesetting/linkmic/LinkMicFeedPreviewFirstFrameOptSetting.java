package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_feed_preview_first_frame_opt")
public final class LinkMicFeedPreviewFirstFrameOptSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicFeedPreviewFirstFrameOptSetting INSTANCE = new LinkMicFeedPreviewFirstFrameOptSetting();

    public static final boolean opt() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_feed_preview_first_frame_opt", DEFAULT);
    }
}
