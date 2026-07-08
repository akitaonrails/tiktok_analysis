package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("link_mic_cohost_mix_stream_av_state")
public final class LinkMicCohostMixStreamAVState {
    public static final boolean DEFAULT = true;
    public static final LinkMicCohostMixStreamAVState INSTANCE = new LinkMicCohostMixStreamAVState();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_cohost_mix_stream_av_state", DEFAULT);
    }
}
