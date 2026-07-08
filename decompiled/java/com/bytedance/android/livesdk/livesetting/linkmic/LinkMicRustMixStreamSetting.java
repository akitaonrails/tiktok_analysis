package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_rust_mix_stream_setting")
public final class LinkMicRustMixStreamSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicRustMixStreamSetting INSTANCE = new LinkMicRustMixStreamSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_rust_mix_stream_setting", DEFAULT);
    }
}
