package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_probe_good_network_bottom_line")
public final class LivePreviewProbeGoodNetworkBottomLine {
    public static final long DEFAULT = 0;
    public static final LivePreviewProbeGoodNetworkBottomLine INSTANCE = new LivePreviewProbeGoodNetworkBottomLine();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("ttlh_probe_good_network_bottom_line", DEFAULT);
    }
}
