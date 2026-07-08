package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_rust_mix_stream_default")
public final class LinkMicRustMixStreamDefault {
    public static final boolean DEFAULT = true;
    public static final LinkMicRustMixStreamDefault INSTANCE = new LinkMicRustMixStreamDefault();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_rust_mix_stream_default", DEFAULT);
    }
}
