package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_search_feed_guest_size_settings")
public final class MultiGuestSearchFeedGuestSizeOptSettings {
    public static final boolean DEFAULT = false;
    public static final MultiGuestSearchFeedGuestSizeOptSettings INSTANCE = new MultiGuestSearchFeedGuestSizeOptSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_search_feed_guest_size_settings", DEFAULT);
    }
}
