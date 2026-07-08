package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_gift_anchor_list_cache")
public final class LiveGiftAnchorListCacheSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGiftAnchorListCacheSetting INSTANCE = new LiveGiftAnchorListCacheSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_anchor_list_cache", DEFAULT);
    }
}
