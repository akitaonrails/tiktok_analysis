package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_load_image_when_scroll_rv")
public final class LiveRecyclerViewImageOptSetting {
    public static final LiveRecyclerViewOptData DEFAULT;
    public static final LiveRecyclerViewImageOptSetting INSTANCE = new LiveRecyclerViewImageOptSetting();
    public static final LiveRecyclerViewOptData setting;

    static {
        LiveRecyclerViewOptData liveRecyclerViewOptData = new LiveRecyclerViewOptData();
        DEFAULT = liveRecyclerViewOptData;
        setting = (LiveRecyclerViewOptData) SettingsManager.INSTANCE.getValueSafely("live_load_image_when_scroll_rv", liveRecyclerViewOptData);
    }

    public final boolean enabled() {
        LiveRecyclerViewOptData liveRecyclerViewOptData = setting;
        if (liveRecyclerViewOptData == null) {
            return false;
        }
        return liveRecyclerViewOptData.enabled;
    }

    public final int dyForRvLabel(String str) {
        Integer num;
        LiveRecyclerViewOptData liveRecyclerViewOptData = setting;
        if (liveRecyclerViewOptData == null || (num = liveRecyclerViewOptData.dyMap.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
