package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_pusher_split_probe")
public final class TTLHPusherSplitProbeSwitch {
    public static final int DEFAULT = 0;
    public static final TTLHPusherSplitProbeSwitch INSTANCE = new TTLHPusherSplitProbeSwitch();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_pusher_split_probe", DEFAULT) == 1;
    }
}
