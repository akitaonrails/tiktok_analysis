package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_nearby_tab_config")
public final class LiveSkylightNearByEntranceSetting {
    public static final LiveSkylightNearByEntranceSetting INSTANCE = new LiveSkylightNearByEntranceSetting();
    public static final NearByEntranceConfig DEFAULT = new NearByEntranceConfig();

    public static final long dataUpdateTime() {
        return INSTANCE.config().dataUpdateTime;
    }

    public static final boolean enableBanner() {
        return INSTANCE.config().enableBanner;
    }

    public static final boolean enableNearby() {
        return INSTANCE.config().enableNearby;
    }

    public static final boolean enableRequestLocation() {
        return INSTANCE.config().enableRequestLocation;
    }

    public static final boolean entranceEnable() {
        return INSTANCE.config().entranceEnable;
    }

    public static final int nearbyRejectLocationMaxTimes() {
        return INSTANCE.config().rejectMaxTimes;
    }

    public final NearByEntranceConfig config() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        NearByEntranceConfig nearByEntranceConfig = DEFAULT;
        NearByEntranceConfig nearByEntranceConfig2 = (NearByEntranceConfig) settingsManager.getValueSafely("live_nearby_tab_config", nearByEntranceConfig);
        return nearByEntranceConfig2 != null ? nearByEntranceConfig2 : nearByEntranceConfig;
    }

    public final NearByEntranceConfig getDEFAULT() {
        return DEFAULT;
    }
}
