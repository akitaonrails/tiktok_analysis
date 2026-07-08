package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_toolbar")
public final class LiveBroadcastToolbarCollapseSetting {
    public static final int DEFAULT = 0;
    public static final LiveBroadcastToolbarCollapseSetting INSTANCE = new LiveBroadcastToolbarCollapseSetting();

    public final boolean collapseInteract() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_toolbar", DEFAULT) == 1;
    }

    public final boolean collapseShare() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_toolbar", DEFAULT) == 2;
    }
}
