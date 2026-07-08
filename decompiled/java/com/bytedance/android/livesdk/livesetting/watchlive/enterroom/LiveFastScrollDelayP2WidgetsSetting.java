package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fast_scroll_delay_p2_widgets")
public final class LiveFastScrollDelayP2WidgetsSetting {
    public static final boolean DEFAULT = false;
    public static final LiveFastScrollDelayP2WidgetsSetting INSTANCE = new LiveFastScrollDelayP2WidgetsSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fast_scroll_delay_p2_widgets", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
