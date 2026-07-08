package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_sheet_demo_lynx_url")
public final class LiveSheetDemoLynxUrlSetting {
    public static final LiveSheetDemoLynxUrlSetting INSTANCE = new LiveSheetDemoLynxUrlSetting();
    public static final LiveSheetDemoLynxUrlConfig DEFAULT = new LiveSheetDemoLynxUrlConfig("", "", "", "");

    public static final String sparkNavigate() {
        return INSTANCE.getSettingValue().sparkNavigate;
    }

    public static final String sparkOfflineNavigate() {
        return INSTANCE.getSettingValue().sparkOfflineNavigate;
    }

    public static final String sparkOfflineOverlay() {
        return INSTANCE.getSettingValue().sparkOfflineOverlay;
    }

    public static final String sparkOverlay() {
        return INSTANCE.getSettingValue().sparkOverlay;
    }

    public final LiveSheetDemoLynxUrlConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveSheetDemoLynxUrlConfig liveSheetDemoLynxUrlConfig = DEFAULT;
        LiveSheetDemoLynxUrlConfig liveSheetDemoLynxUrlConfig2 = (LiveSheetDemoLynxUrlConfig) settingsManager.getValueSafely("live_sheet_demo_lynx_url", liveSheetDemoLynxUrlConfig);
        return liveSheetDemoLynxUrlConfig2 != null ? liveSheetDemoLynxUrlConfig2 : liveSheetDemoLynxUrlConfig;
    }
}
