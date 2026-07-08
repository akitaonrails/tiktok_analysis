package com.bytedance.android.livesdk.comp.api.pcs.data.setting.onestopshop;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_pcs_one_stop_shop_cache_duration")
public final class LivePcsOneStopShopCacheDurationSetting {
    public static final long CACHE_ENABLED = 120;
    public static final long DEFAULT = 0;
    public static final LivePcsOneStopShopCacheDurationSetting INSTANCE = new LivePcsOneStopShopCacheDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_pcs_one_stop_shop_cache_duration", DEFAULT);
    }

    public final boolean isPrefetchEnabled() {
        return getValue() > 0;
    }
}
