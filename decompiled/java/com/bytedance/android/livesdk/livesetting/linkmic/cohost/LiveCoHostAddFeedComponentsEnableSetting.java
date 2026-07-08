package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_feed_add_cohost_match_components_enable")
public final class LiveCoHostAddFeedComponentsEnableSetting {
    public static final LiveCoHostAddFeedComponentsEnableSetting INSTANCE = new LiveCoHostAddFeedComponentsEnableSetting();
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_feed_add_cohost_match_components_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
