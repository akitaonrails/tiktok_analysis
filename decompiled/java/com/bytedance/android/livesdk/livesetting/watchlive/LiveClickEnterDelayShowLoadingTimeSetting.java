package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C486960J7u;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_click_enter_delay_show_loading_time")
public final class LiveClickEnterDelayShowLoadingTimeSetting {
    public static final int DEFAULT = 0;
    public static final LiveClickEnterDelayShowLoadingTimeSetting INSTANCE = new LiveClickEnterDelayShowLoadingTimeSetting();

    public final int getValue() {
        return C486960J7u.LIZ() ? DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL : SettingsManager.INSTANCE.getIntValue("live_click_enter_delay_show_loading_time", DEFAULT);
    }
}
