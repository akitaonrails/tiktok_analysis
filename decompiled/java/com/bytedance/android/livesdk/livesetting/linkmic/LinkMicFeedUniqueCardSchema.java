package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_feed_unique_card_schema")
public final class LinkMicFeedUniqueCardSchema {
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=tiktok_live_mg_feed";
    public static final LinkMicFeedUniqueCardSchema INSTANCE = new LinkMicFeedUniqueCardSchema();

    public static final String getSchema() {
        return SettingsManager.INSTANCE.getStringValue("multi_guest_feed_unique_card_schema", DEFAULT);
    }
}
