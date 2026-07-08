package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_predownload_interactive_asset_phase2_setting")
public final class LiveGiftPreDownloadInteractiveAssetSetting {
    public static final LiveGiftPreDownloadInteractiveAssetSetting INSTANCE = new LiveGiftPreDownloadInteractiveAssetSetting();
    public static final LiveGiftPreloadInteractiveAssetConfig DEFAULT = new LiveGiftPreloadInteractiveAssetConfig(true, 10);

    private final LiveGiftPreloadInteractiveAssetConfig getConfigParams() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveGiftPreloadInteractiveAssetConfig liveGiftPreloadInteractiveAssetConfig = DEFAULT;
        LiveGiftPreloadInteractiveAssetConfig liveGiftPreloadInteractiveAssetConfig2 = (LiveGiftPreloadInteractiveAssetConfig) settingsManager.getValueSafely("live_gift_predownload_interactive_asset_phase2_setting", liveGiftPreloadInteractiveAssetConfig);
        return liveGiftPreloadInteractiveAssetConfig2 != null ? liveGiftPreloadInteractiveAssetConfig2 : liveGiftPreloadInteractiveAssetConfig;
    }

    public final int getPreloadCount() {
        return getConfigParams().preloadCount;
    }

    public final boolean isEnable() {
        return getConfigParams().isEnable;
    }

    public final LiveGiftPreloadInteractiveAssetConfig getDEFAULT() {
        return DEFAULT;
    }
}
