package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_feed_add_cohost_match_components_redesign")
public final class LiveCoHostAddFeedComponentsRedesignSetting {
    public static final int DEFAULT = 0;
    public static final LiveCoHostAddFeedComponentsRedesignSetting INSTANCE = new LiveCoHostAddFeedComponentsRedesignSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_feed_add_cohost_match_components_redesign", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
