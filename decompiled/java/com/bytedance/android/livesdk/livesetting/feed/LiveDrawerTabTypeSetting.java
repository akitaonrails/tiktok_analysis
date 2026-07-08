package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_drawer_tab_type")
public final class LiveDrawerTabTypeSetting {
    public static final int DEFAULT = 0;
    public static final LiveDrawerTabTypeSetting INSTANCE = new LiveDrawerTabTypeSetting();
    public static final int TAB = 1;
    public static final int TAB_LANDING = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_drawer_tab_type", DEFAULT);
    }
}
