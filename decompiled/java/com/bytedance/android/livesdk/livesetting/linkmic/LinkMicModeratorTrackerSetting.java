package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_moderator_tracker_show")
public final class LinkMicModeratorTrackerSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicModeratorTrackerSetting INSTANCE = new LinkMicModeratorTrackerSetting();

    public final boolean opt() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_moderator_tracker_show", DEFAULT);
    }
}
