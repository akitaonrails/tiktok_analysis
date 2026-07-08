package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_viewer_wishes_queue_list_refresh_interval")
public final class LiveViewerWishesQueueListRefreshInterval {
    public static final LiveViewerWishesQueueListRefreshInterval INSTANCE = new LiveViewerWishesQueueListRefreshInterval();
    public static final long DEFAULT = 5;

    public final long value() {
        return SettingsManager.INSTANCE.getLongValue("live_viewer_wishes_queue_list_refresh_interval", DEFAULT);
    }
}
