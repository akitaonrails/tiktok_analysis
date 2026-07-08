package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_repost_new_awareness_store")
public final class LiveRepostNewAwarenessStoreSetting {
    public static final boolean DEFAULT = false;
    public static final LiveRepostNewAwarenessStoreSetting INSTANCE = new LiveRepostNewAwarenessStoreSetting();

    public final boolean hitExperiment() {
        return SettingsManager.INSTANCE.getBooleanValue("live_repost_new_awareness_store", DEFAULT);
    }
}
