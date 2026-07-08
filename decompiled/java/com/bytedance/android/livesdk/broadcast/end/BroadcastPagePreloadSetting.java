package com.bytedance.android.livesdk.broadcast.end;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "broadcast_page_preload")
public final class BroadcastPagePreloadSetting {
    public static final boolean DEFAULT = true;
    public static final BroadcastPagePreloadSetting INSTANCE = new BroadcastPagePreloadSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("broadcast_page_preload", DEFAULT);
    }
}
