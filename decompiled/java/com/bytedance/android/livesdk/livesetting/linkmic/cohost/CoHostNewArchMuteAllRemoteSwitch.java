package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "co_host_new_arch_mute_all_remote_switch")
public final class CoHostNewArchMuteAllRemoteSwitch {
    public static final boolean DEFAULT = true;
    public static final CoHostNewArchMuteAllRemoteSwitch INSTANCE = new CoHostNewArchMuteAllRemoteSwitch();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("co_host_new_arch_mute_all_remote_switch", DEFAULT);
    }
}
