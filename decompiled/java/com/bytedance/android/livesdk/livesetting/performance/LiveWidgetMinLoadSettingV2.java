package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_widget_min_load_v2")
public final class LiveWidgetMinLoadSettingV2 {
    public static final LiveWidgetMinLoadSettingV2 INSTANCE = new LiveWidgetMinLoadSettingV2();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_widget_min_load_v2", DEFAULT);

    public final boolean enableCommentComboTray() {
        return (value & 1) == 1;
    }

    public final boolean enablePinCard() {
        return (value & 4) == 4;
    }

    public final boolean enableSlotBarrage() {
        return (value & 2) == 2;
    }

    public final boolean enableSubCommonGuideCard() {
        return (value & 8) == 8;
    }
}
