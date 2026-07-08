package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "enable_channel_based_track_support_group_channel_id")
public final class EnableChannelBasedTrackSupportGroupChannelIdSetting {
    public static final boolean DEFAULT = false;
    public static final EnableChannelBasedTrackSupportGroupChannelIdSetting INSTANCE = new EnableChannelBasedTrackSupportGroupChannelIdSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_channel_based_track_support_group_channel_id", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
