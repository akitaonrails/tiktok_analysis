package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "enable_feed_full_link_track_add_multi_params")
public final class MultiGuestEnableFeedFullLinkTrackAddMultiParamsSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestEnableFeedFullLinkTrackAddMultiParamsSetting INSTANCE = new MultiGuestEnableFeedFullLinkTrackAddMultiParamsSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("enable_feed_full_link_track_add_multi_params", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
