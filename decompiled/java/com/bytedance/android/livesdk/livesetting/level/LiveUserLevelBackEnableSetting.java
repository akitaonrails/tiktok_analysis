package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_user_level_back_enable")
public final class LiveUserLevelBackEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveUserLevelBackEnableSetting INSTANCE = new LiveUserLevelBackEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_user_level_back_enable", DEFAULT);
    }
}
