package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_feed_search_preview_new_layout_integration")
public final class LinkMicSupportNewLayoutInFeedSetting {
    public static final int DEFAULT = 0;
    public static final LinkMicSupportNewLayoutInFeedSetting INSTANCE = new LinkMicSupportNewLayoutInFeedSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_feed_search_preview_new_layout_integration", DEFAULT) == 1;
    }
}
