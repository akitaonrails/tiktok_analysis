package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_match_ice_showdown_enable")
public final class LiveCoHostIcyClashMatchSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCoHostIcyClashMatchSetting INSTANCE = new LiveCoHostIcyClashMatchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_ice_showdown_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
