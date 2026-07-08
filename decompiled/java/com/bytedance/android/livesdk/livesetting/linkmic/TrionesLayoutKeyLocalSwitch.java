package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "triones_layout_key_local_switch")
public final class TrionesLayoutKeyLocalSwitch {
    public static final boolean DEFAULT = false;
    public static final TrionesLayoutKeyLocalSwitch INSTANCE = new TrionesLayoutKeyLocalSwitch();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("triones_layout_key_local_switch", DEFAULT);
    }
}
