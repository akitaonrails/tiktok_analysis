package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_center_temperature_network_display")
public final class LiveCenterTemperNetDisplaySetting {
    public static final int DEFAULT = 0;
    public static final LiveCenterTemperNetDisplaySetting INSTANCE = new LiveCenterTemperNetDisplaySetting();
    public static final List<Integer> SHOW_TEMP_GROUP = C1697810uHb.LJIIJJI(1, 4);

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_center_temperature_network_display", DEFAULT);
    }

    public final boolean hasTemperatureDisplay() {
        return SHOW_TEMP_GROUP.contains(Integer.valueOf(getValue()));
    }

    public final boolean inExperiment() {
        return getValue() > 0;
    }

    public final boolean showHouseIcon() {
        int value = getValue();
        return 1 <= value && value < 3;
    }
}
