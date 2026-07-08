package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "fix_broadcast_lifecycle_manager")
public final class FixBroadcastLifecycleManager {
    public static final boolean DEFAULT = false;
    public static final FixBroadcastLifecycleManager INSTANCE = new FixBroadcastLifecycleManager();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("fix_broadcast_lifecycle_manager", DEFAULT);
    }
}
