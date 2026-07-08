package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_match_reactor_by_ice_showdown_enable")
public final class LiveCoHostRefactorByIcyClashMatchSetting {
    public static final LiveCoHostRefactorByIcyClashMatchSetting INSTANCE = new LiveCoHostRefactorByIcyClashMatchSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_reactor_by_ice_showdown_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
