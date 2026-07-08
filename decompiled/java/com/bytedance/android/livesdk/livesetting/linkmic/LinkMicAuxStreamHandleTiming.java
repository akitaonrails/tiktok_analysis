package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_aux_stream_handle_timing")
public final class LinkMicAuxStreamHandleTiming {
    public static final boolean DEFAULT = true;
    public static final LinkMicAuxStreamHandleTiming INSTANCE = new LinkMicAuxStreamHandleTiming();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_aux_stream_handle_timing", DEFAULT);
    }
}
