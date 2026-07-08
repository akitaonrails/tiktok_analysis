package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_cache_global_gift")
public final class LiveGiftCacheGlobalGift {
    public static final LiveGiftCacheGlobalGift INSTANCE = new LiveGiftCacheGlobalGift();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_cache_global_gift", DEFAULT);
    }
}
