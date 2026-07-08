package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_sdk_forward_stream_protect_conf")
public final class LinkMicSDKForwardStreamProtectConfSetting {
    public static final LinkMicSDKForwardStreamProtectConfSetting INSTANCE = new LinkMicSDKForwardStreamProtectConfSetting();
    public static final LinkMicSDKForwardStreamProtectConf DEFAULT = new LinkMicSDKForwardStreamProtectConf(true, true, 20, 15, 15);

    public final LinkMicSDKForwardStreamProtectConf getValue() {
        LinkMicSDKForwardStreamProtectConf linkMicSDKForwardStreamProtectConf = (LinkMicSDKForwardStreamProtectConf) SettingsManager.INSTANCE.getValueSafely(LinkMicSDKForwardStreamProtectConfSetting.class);
        return linkMicSDKForwardStreamProtectConf == null ? DEFAULT : linkMicSDKForwardStreamProtectConf;
    }
}
