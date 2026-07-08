package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_feed_show_unique_card_hit_host")
public final class LinkMicFeedShowUniqueCardHitHostSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicFeedShowUniqueCardHitHostSetting INSTANCE = new LinkMicFeedShowUniqueCardHitHostSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_feed_show_unique_card_hit_host", DEFAULT);
    }
}
