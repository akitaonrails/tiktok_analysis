package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("broadcast_widget_frame_budget")
public final class BroadcastWidgetFrameBudgetSetting {
    public static final BroadcastWidgetFrameBudgetSetting INSTANCE = new BroadcastWidgetFrameBudgetSetting();
    public static final BroadcastWidgetFrameBudgetOption DEFAULT = new BroadcastWidgetFrameBudgetOption();

    public final BroadcastWidgetFrameBudgetOption getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BroadcastWidgetFrameBudgetOption broadcastWidgetFrameBudgetOption = DEFAULT;
        BroadcastWidgetFrameBudgetOption broadcastWidgetFrameBudgetOption2 = (BroadcastWidgetFrameBudgetOption) settingsManager.getValueSafely("broadcast_widget_frame_budget", broadcastWidgetFrameBudgetOption);
        return broadcastWidgetFrameBudgetOption2 != null ? broadcastWidgetFrameBudgetOption2 : broadcastWidgetFrameBudgetOption;
    }

    public final long getBudget(float f) {
        BroadcastWidgetFrameBudgetOption value = getValue();
        if (f < value.getLowEndDeviceScore()) {
            return value.getLowEndDeviceBudget();
        }
        if (f < value.getMediumEndDeviceScore()) {
            return value.getMediumEndDeviceBudget();
        }
        return value.getHighEndDeviceBudget();
    }
}
