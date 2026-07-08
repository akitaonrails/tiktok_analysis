package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_preview_non_play_event_exp")
public final class LivePreviewNonPlayEventLogSetting {
    public static final LivePreviewNonPlayEventLogSetting INSTANCE = new LivePreviewNonPlayEventLogSetting();
    public static final boolean DEFAULT = false;
    public static final boolean isDisable = SettingsManager.INSTANCE.getBooleanValue("live_preview_non_play_event_exp", DEFAULT);

    public final boolean isDisable() {
        return isDisable;
    }
}
