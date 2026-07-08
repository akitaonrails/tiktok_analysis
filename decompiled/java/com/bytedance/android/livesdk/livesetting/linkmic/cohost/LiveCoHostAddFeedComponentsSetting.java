package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_feed_add_cohost_match_components")
public final class LiveCoHostAddFeedComponentsSetting {
    public static final int DEFAULT = 0;
    public static final LiveCoHostAddFeedComponentsSetting INSTANCE = new LiveCoHostAddFeedComponentsSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_feed_add_cohost_match_components", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
