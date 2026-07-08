package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.LiveUplinkConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_uplink_strategy")
public final class LiveUplinkStrategySetting {
    public static final LiveUplinkStrategySetting INSTANCE = new LiveUplinkStrategySetting();
    public static final LiveUplinkConfig DEFAULT = new LiveUplinkConfig();

    private final LiveUplinkConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveUplinkConfig liveUplinkConfig = DEFAULT;
        LiveUplinkConfig liveUplinkConfig2 = (LiveUplinkConfig) settingsManager.getValueSafely("live_uplink_strategy", liveUplinkConfig);
        return liveUplinkConfig2 != null ? liveUplinkConfig2 : liveUplinkConfig;
    }

    public final Map<String, Map<String, Long>> getUplinkApiAllowedList() {
        return getSettingValue().uplinkApiAllowedList;
    }

    public final boolean getWsFailFallbackToHttp() {
        return getSettingValue().wsFailFallbackToHttp;
    }

    public final long getWsUplinkWaitTimeout() {
        return getSettingValue().wsUplinkWaitTimeout;
    }

    public final boolean supportHttpUplink() {
        return getSettingValue().uplinkStrategy == 0;
    }

    public final boolean supportUplink() {
        return getSettingValue().enable;
    }

    public final boolean supportWSUplink() {
        return getSettingValue().uplinkStrategy != 2;
    }

    public final Map<String, Map<String, Long>> uplinkApiAlternativeServiceIdList() {
        return getSettingValue().uplinkApiAlternativeServiceIdList;
    }
}
