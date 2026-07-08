package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_ice_showdown_leak_fix_enable")
public final class LiveCoHostIcyClashMatchLeakFixSetting {
    public static final LiveCoHostIcyClashMatchLeakFixSetting INSTANCE = new LiveCoHostIcyClashMatchLeakFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_ice_showdown_leak_fix_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
