package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_layout_central_operate_insets_bottom_value")
public final class LinkMicLayoutCentralOperateInsetsBottomValueSetting {
    public static final LinkMicLayoutCentralOperateInsetsBottomValueSetting INSTANCE = new LinkMicLayoutCentralOperateInsetsBottomValueSetting();
    public static final CentralInsetsBottomConfig DEFAULT = new CentralInsetsBottomConfig(56, 156, 56, 56, 56);

    public final CentralInsetsBottomConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        CentralInsetsBottomConfig centralInsetsBottomConfig = DEFAULT;
        CentralInsetsBottomConfig centralInsetsBottomConfig2 = (CentralInsetsBottomConfig) settingsManager.getValueSafely("link_mic_layout_central_operate_insets_bottom_value", centralInsetsBottomConfig);
        return centralInsetsBottomConfig2 != null ? centralInsetsBottomConfig2 : centralInsetsBottomConfig;
    }
}
