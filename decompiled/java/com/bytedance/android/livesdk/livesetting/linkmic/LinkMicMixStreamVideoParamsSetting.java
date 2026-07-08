package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("mix_stream_video")
public final class LinkMicMixStreamVideoParamsSetting {
    public static final LinkMicMixStreamVideoParamsSetting INSTANCE = new LinkMicMixStreamVideoParamsSetting();
    public static final LinkMicMixStreamVideoParams DEFAULT = new LinkMicMixStreamVideoParams("", -1, -1);

    public final LinkMicMixStreamVideoParams getValue() {
        LinkMicMixStreamVideoParams linkMicMixStreamVideoParams = (LinkMicMixStreamVideoParams) SettingsManager.INSTANCE.getValueSafely(LinkMicMixStreamVideoParamsSetting.class);
        return linkMicMixStreamVideoParams == null ? DEFAULT : linkMicMixStreamVideoParams;
    }
}
