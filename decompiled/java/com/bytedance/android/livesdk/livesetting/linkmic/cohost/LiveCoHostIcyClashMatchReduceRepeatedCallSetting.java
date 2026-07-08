package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_ice_showdown_reduce_repeated_call_enable")
public final class LiveCoHostIcyClashMatchReduceRepeatedCallSetting {
    public static final LiveCoHostIcyClashMatchReduceRepeatedCallSetting INSTANCE = new LiveCoHostIcyClashMatchReduceRepeatedCallSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_ice_showdown_reduce_repeated_call_enable", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
