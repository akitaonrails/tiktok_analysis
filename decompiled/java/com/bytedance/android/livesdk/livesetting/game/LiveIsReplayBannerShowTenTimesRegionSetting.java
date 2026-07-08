package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_is_replay_banner_show_ten_times_region")
public final class LiveIsReplayBannerShowTenTimesRegionSetting {
    public static final boolean DEFAULT = false;
    public static final LiveIsReplayBannerShowTenTimesRegionSetting INSTANCE = new LiveIsReplayBannerShowTenTimesRegionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_is_replay_banner_show_ten_times_region", DEFAULT);
    }
}
