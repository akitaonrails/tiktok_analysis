package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_skylight_refresh_when_back_from_live")
public final class LiveSkylightRefreshWhenBackFromLiveSetting {
    public static final LiveSkylightRefreshWhenBackFromLiveSetting INSTANCE = new LiveSkylightRefreshWhenBackFromLiveSetting();
    public static final boolean DEFAULT = true;

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_skylight_refresh_when_back_from_live", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
