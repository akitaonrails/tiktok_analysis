package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_list_delta_cache_max_count")
public final class LiveGiftListCacheMaxCountSettings {
    public static final int DEFAULT = 1500;
    public static final LiveGiftListCacheMaxCountSettings INSTANCE = new LiveGiftListCacheMaxCountSettings();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_gift_list_delta_cache_max_count", DEFAULT);
    }
}
