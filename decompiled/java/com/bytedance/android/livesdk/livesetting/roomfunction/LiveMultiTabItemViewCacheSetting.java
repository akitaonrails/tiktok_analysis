package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_multi_tab_item_view_cache")
public final class LiveMultiTabItemViewCacheSetting {
    public static final LiveMultiTabItemViewCacheSetting INSTANCE = new LiveMultiTabItemViewCacheSetting();
    public static final ItemViewCacheModel DEFAULT = new ItemViewCacheModel(1, 0);

    public final ItemViewCacheModel getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ItemViewCacheModel itemViewCacheModel = DEFAULT;
        ItemViewCacheModel itemViewCacheModel2 = (ItemViewCacheModel) settingsManager.getValueSafely("live_multi_tab_item_view_cache", itemViewCacheModel);
        return itemViewCacheModel2 != null ? itemViewCacheModel2 : itemViewCacheModel;
    }
}
