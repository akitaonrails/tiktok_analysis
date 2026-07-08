package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = true, value = "live_anchor_widget_load_exp")
public final class AnchorWidgetLoadExpSettings {
    public static final AnchorWidgetLoadExpSettings INSTANCE = new AnchorWidgetLoadExpSettings();
    public static final AnchorWidgetLoadExpConfig DEFAULT = new AnchorWidgetLoadExpConfig();

    public static final AnchorWidgetLoadExpConfig value() {
        AnchorWidgetLoadExpConfig anchorWidgetLoadExpConfig = (AnchorWidgetLoadExpConfig) SettingsManager.INSTANCE.getValueSafely(AnchorWidgetLoadExpSettings.class);
        return anchorWidgetLoadExpConfig == null ? DEFAULT : anchorWidgetLoadExpConfig;
    }
}
