package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_center_horizontal_spacing")
public final class LiveCenterCardHSpacingConfig {
    public static final int DEFAULT = 12;
    public static final LiveCenterCardHSpacingConfig INSTANCE = new LiveCenterCardHSpacingConfig();

    public final float getFloatValue() {
        return SettingsManager.INSTANCE.getIntValue("live_center_horizontal_spacing", DEFAULT);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_center_horizontal_spacing", DEFAULT);
    }
}
