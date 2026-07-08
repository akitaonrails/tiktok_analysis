package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("toplive_load_with_refresh")
public final class TopliveLoadWithRefreshSetting {
    public static final boolean DEFAULT = false;
    public static final TopliveLoadWithRefreshSetting INSTANCE = new TopliveLoadWithRefreshSetting();

    public final boolean getConfig() {
        return SettingsManager.INSTANCE.getBooleanValue("toplive_load_with_refresh", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
