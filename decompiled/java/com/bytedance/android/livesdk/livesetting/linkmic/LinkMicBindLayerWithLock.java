package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_bind_layer_with_lock")
public final class LinkMicBindLayerWithLock {
    public static final boolean DEFAULT = false;
    public static final LinkMicBindLayerWithLock INSTANCE = new LinkMicBindLayerWithLock();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_bind_layer_with_lock", DEFAULT);
    }
}
