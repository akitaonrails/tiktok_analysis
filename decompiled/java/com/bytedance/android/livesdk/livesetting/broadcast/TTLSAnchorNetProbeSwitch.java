package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttls_anchor_net_rtc_prober")
public final class TTLSAnchorNetProbeSwitch {
    public static final int DEFAULT = 0;
    public static final TTLSAnchorNetProbeSwitch INSTANCE = new TTLSAnchorNetProbeSwitch();

    public final boolean isAnchorNetUseRtcProbe() {
        return SettingsManager.INSTANCE.getIntValue("ttls_anchor_net_rtc_prober", DEFAULT) == 1;
    }
}
