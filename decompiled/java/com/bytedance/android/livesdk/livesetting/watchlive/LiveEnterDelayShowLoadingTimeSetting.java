package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C486960J7u;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_enter_delay_show_loading_time")
public final class LiveEnterDelayShowLoadingTimeSetting {
    public static final int DEFAULT = 200;
    public static final LiveEnterDelayShowLoadingTimeSetting INSTANCE = new LiveEnterDelayShowLoadingTimeSetting();

    public final int getValue() {
        if (C486960J7u.LIZ()) {
            return 200;
        }
        return SettingsManager.INSTANCE.getIntValue("live_enter_delay_show_loading_time", DEFAULT);
    }
}
