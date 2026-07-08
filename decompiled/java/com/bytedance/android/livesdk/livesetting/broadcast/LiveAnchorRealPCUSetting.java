package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_stable_mode_enable_real_pcu")
public final class LiveAnchorRealPCUSetting {
    public static final boolean DEFAULT = false;
    public static final LiveAnchorRealPCUSetting INSTANCE = new LiveAnchorRealPCUSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_anchor_stable_mode_enable_real_pcu", DEFAULT);
    }
}
