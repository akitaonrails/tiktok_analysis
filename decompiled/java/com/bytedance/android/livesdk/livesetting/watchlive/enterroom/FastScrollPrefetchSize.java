package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("fast_scroll_prefetch_size")
public final class FastScrollPrefetchSize {
    public static final int DEFAULT = 2;
    public static final FastScrollPrefetchSize INSTANCE = new FastScrollPrefetchSize();

    public static final int size() {
        return SettingsManager.INSTANCE.getIntValue("fast_scroll_prefetch_size", DEFAULT);
    }
}
