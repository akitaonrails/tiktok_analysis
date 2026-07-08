package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_widget_min_load_v3")
public final class LiveWidgetMinLoadSettingV3 {
    public static final LiveWidgetMinLoadSettingV3 INSTANCE = new LiveWidgetMinLoadSettingV3();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_widget_min_load_v3", DEFAULT);

    public final boolean enableEventDSC() {
        return (value & 4) == 4;
    }

    public final boolean enableFrameL3Card() {
        return (value & 8) == 8;
    }

    public final boolean enablePrivilegeAnnouncement() {
        return (value & 2) == 2;
    }

    public final boolean enableSubTrailCard() {
        return (value & 1) == 1;
    }
}
