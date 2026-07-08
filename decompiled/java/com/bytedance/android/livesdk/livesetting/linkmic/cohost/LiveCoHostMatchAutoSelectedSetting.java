package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_auto_select_type_enable")
public final class LiveCoHostMatchAutoSelectedSetting {
    public static final LiveCoHostMatchAutoSelectedSetting INSTANCE = new LiveCoHostMatchAutoSelectedSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_auto_select_type_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
