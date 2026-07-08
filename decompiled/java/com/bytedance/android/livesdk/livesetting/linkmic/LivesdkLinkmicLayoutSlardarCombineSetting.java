package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey("livesdk_linkmic_layout_slardar_combine")
public final class LivesdkLinkmicLayoutSlardarCombineSetting {
    public static final int DEFAULT = 0;
    public static final LivesdkLinkmicLayoutSlardarCombineSetting INSTANCE = new LivesdkLinkmicLayoutSlardarCombineSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("livesdk_linkmic_layout_slardar_combine", DEFAULT);
    }

    public final boolean isLayoutGuestChangeReportEnable() {
        return (getValue() & 16) != 0;
    }

    public final boolean isLayoutLoadReportEnable() {
        return (getValue() & 2) != 0;
    }

    public final boolean isLayoutMeasureReportEnable() {
        return (getValue() & 4) != 0;
    }

    public final boolean isLayoutRenderEnable() {
        return (getValue() & 8) != 0;
    }

    public final boolean isLayoutSwitchReportEnable() {
        return (getValue() & 1) != 0;
    }
}
