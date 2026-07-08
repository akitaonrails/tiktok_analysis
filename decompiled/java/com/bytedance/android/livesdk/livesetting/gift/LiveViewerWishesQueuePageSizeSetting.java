package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_viewer_wishes_queue_list_page_size")
public final class LiveViewerWishesQueuePageSizeSetting {
    public static final LiveViewerWishesQueuePageSizeSetting INSTANCE = new LiveViewerWishesQueuePageSizeSetting();
    public static final long DEFAULT = 50;

    public final long value() {
        return SettingsManager.INSTANCE.getLongValue("live_viewer_wishes_queue_list_page_size", DEFAULT);
    }
}
