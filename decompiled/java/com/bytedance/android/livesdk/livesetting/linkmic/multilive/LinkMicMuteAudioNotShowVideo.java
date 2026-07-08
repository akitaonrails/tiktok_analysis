package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_mute_audio_not_show_video")
public final class LinkMicMuteAudioNotShowVideo {
    public static final boolean DEFAULT = false;
    public static final LinkMicMuteAudioNotShowVideo INSTANCE = new LinkMicMuteAudioNotShowVideo();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_mute_audio_not_show_video", DEFAULT);
    }
}
