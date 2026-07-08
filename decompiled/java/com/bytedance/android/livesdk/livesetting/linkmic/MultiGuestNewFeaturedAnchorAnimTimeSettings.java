package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_featured_entrance_animation_interval")
public final class MultiGuestNewFeaturedAnchorAnimTimeSettings {
    public static final MultiGuestNewFeaturedAnchorAnimTimeSettings INSTANCE = new MultiGuestNewFeaturedAnchorAnimTimeSettings();
    public static final int DEFAULT = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;

    public final int getTime() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_multi_guest_featured_entrance_animation_interval", DEFAULT);
    }
}
