package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttls_anchor_net_mock_fallback")
public final class TTLSAnchorNetMockSetting {
    public static final int DEFAULT = 0;
    public static final TTLSAnchorNetMockSetting INSTANCE = new TTLSAnchorNetMockSetting();

    public final int anchorNetMockFallbackTime() {
        return SettingsManager.INSTANCE.getIntValue("ttls_anchor_net_mock_fallback", DEFAULT);
    }
}
