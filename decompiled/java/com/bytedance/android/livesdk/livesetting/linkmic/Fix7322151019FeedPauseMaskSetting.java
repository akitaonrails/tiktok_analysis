package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "fix_7322151019_feed_pause_mask")
public final class Fix7322151019FeedPauseMaskSetting {
    public static final boolean DEFAULT = true;
    public static final Fix7322151019FeedPauseMaskSetting INSTANCE = new Fix7322151019FeedPauseMaskSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("fix_7322151019_feed_pause_mask", DEFAULT);
    }
}
