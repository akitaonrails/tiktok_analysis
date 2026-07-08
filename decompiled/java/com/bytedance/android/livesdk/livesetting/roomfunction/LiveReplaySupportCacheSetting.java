package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_replay_support_cache")
public final class LiveReplaySupportCacheSetting {
    public static final boolean DEFAULT = false;
    public static final LiveReplaySupportCacheSetting INSTANCE = new LiveReplaySupportCacheSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_replay_support_cache", DEFAULT);
    }

    public final boolean disable() {
        return !enable();
    }
}
