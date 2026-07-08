package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_ice_showdown_delay_ensure_lynxview_enable")
public final class LiveCoHostIcyClashMatchDelayEnsureLynxViewSetting {
    public static final boolean DEFAULT = false;
    public static final LiveCoHostIcyClashMatchDelayEnsureLynxViewSetting INSTANCE = new LiveCoHostIcyClashMatchDelayEnsureLynxViewSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_ice_showdown_delay_ensure_lynxview_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
