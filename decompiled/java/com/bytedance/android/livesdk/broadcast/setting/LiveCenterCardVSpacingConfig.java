package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_center_vertical_spacing")
public final class LiveCenterCardVSpacingConfig {
    public static final int DEFAULT = 10;
    public static final LiveCenterCardVSpacingConfig INSTANCE = new LiveCenterCardVSpacingConfig();

    public final float getFloatValue() {
        return SettingsManager.INSTANCE.getIntValue("live_center_vertical_spacing", DEFAULT);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_center_vertical_spacing", DEFAULT);
    }
}
