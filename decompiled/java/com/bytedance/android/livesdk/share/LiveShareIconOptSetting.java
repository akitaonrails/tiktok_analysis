package com.bytedance.android.livesdk.share;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_toolbar_no_title_share_icon_opt_new")
public final class LiveShareIconOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveShareIconOptSetting INSTANCE = new LiveShareIconOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_toolbar_no_title_share_icon_opt_new", DEFAULT);
    }
}
