package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_probe_normal_network_bottom_line")
public final class LivePreviewProbeNormalNetworkBottomLine {
    public static final long DEFAULT = 0;
    public static final LivePreviewProbeNormalNetworkBottomLine INSTANCE = new LivePreviewProbeNormalNetworkBottomLine();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("ttlh_probe_normal_network_bottom_line", DEFAULT);
    }
}
