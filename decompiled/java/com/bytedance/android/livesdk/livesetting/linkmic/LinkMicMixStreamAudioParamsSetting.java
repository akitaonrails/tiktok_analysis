package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("mix_stream_audio")
public final class LinkMicMixStreamAudioParamsSetting {
    public static final LinkMicMixStreamAudioParamsSetting INSTANCE = new LinkMicMixStreamAudioParamsSetting();
    public static final LinkMicMixStreamAudioParams DEFAULT = new LinkMicMixStreamAudioParams(-1, -1, -1, "");

    public final LinkMicMixStreamAudioParams getValue() {
        LinkMicMixStreamAudioParams linkMicMixStreamAudioParams = (LinkMicMixStreamAudioParams) SettingsManager.INSTANCE.getValueSafely(LinkMicMixStreamAudioParamsSetting.class);
        return linkMicMixStreamAudioParams == null ? DEFAULT : linkMicMixStreamAudioParams;
    }
}
