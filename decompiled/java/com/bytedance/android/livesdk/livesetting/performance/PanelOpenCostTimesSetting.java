package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_sdk_panel_open_cost_times")
public final class PanelOpenCostTimesSetting {
    public static final PanelOpenCostTimesSetting INSTANCE = new PanelOpenCostTimesSetting();
    public static final LivePanelCostTimeModel DEFAULT = new LivePanelCostTimeModel(true, 3);

    public final LivePanelCostTimeModel getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePanelCostTimeModel livePanelCostTimeModel = DEFAULT;
        LivePanelCostTimeModel livePanelCostTimeModel2 = (LivePanelCostTimeModel) settingsManager.getValueSafely("live_sdk_panel_open_cost_times", livePanelCostTimeModel);
        return livePanelCostTimeModel2 != null ? livePanelCostTimeModel2 : livePanelCostTimeModel;
    }
}
