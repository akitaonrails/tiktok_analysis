package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multiguest_opt_panel_fix_layout_config")
public final class MultiGuestOptPanelFixLayoutConfigSetting {
    public static final MultiGuestOptPanelFixLayoutConfigSetting INSTANCE = new MultiGuestOptPanelFixLayoutConfigSetting();
    public static final MultiGuestOptPanelFixLayoutConfig DEFAULT = new MultiGuestOptPanelFixLayoutConfig(7, true);

    public final MultiGuestOptPanelFixLayoutConfig getValue() {
        MultiGuestOptPanelFixLayoutConfig multiGuestOptPanelFixLayoutConfig = (MultiGuestOptPanelFixLayoutConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestOptPanelFixLayoutConfigSetting.class);
        return multiGuestOptPanelFixLayoutConfig == null ? DEFAULT : multiGuestOptPanelFixLayoutConfig;
    }
}
