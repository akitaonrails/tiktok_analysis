package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_incentive_resource_config")
public final class LiveCoinIncentiveResConfigSettings {
    public static final LiveCoinIncentiveResConfigSettings INSTANCE = new LiveCoinIncentiveResConfigSettings();
    public static final PendantWidgetSettingsParams DEFAULT = new PendantWidgetSettingsParams(0, null, null, 7, null);

    public final PendantWidgetSettingsParams widgetSettings() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PendantWidgetSettingsParams pendantWidgetSettingsParams = DEFAULT;
        PendantWidgetSettingsParams pendantWidgetSettingsParams2 = (PendantWidgetSettingsParams) settingsManager.getValueSafely("live_incentive_resource_config", pendantWidgetSettingsParams);
        return pendantWidgetSettingsParams2 != null ? pendantWidgetSettingsParams2 : pendantWidgetSettingsParams;
    }
}
