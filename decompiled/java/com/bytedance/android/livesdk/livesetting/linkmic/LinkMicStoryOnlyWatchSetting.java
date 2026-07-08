package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "share_live_to_story_only_watch_live")
public final class LinkMicStoryOnlyWatchSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicStoryOnlyWatchSetting INSTANCE = new LinkMicStoryOnlyWatchSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("share_live_to_story_only_watch_live", DEFAULT);
    }
}
