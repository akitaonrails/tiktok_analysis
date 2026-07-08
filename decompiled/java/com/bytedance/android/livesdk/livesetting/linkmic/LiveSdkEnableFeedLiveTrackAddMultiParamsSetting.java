package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "enable_feed_live_track_add_multi_params")
public final class LiveSdkEnableFeedLiveTrackAddMultiParamsSetting {
    public static final int DEFAULT = 0;
    public static final LiveSdkEnableFeedLiveTrackAddMultiParamsSetting INSTANCE = new LiveSdkEnableFeedLiveTrackAddMultiParamsSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("enable_feed_live_track_add_multi_params", DEFAULT) == 1;
    }
}
