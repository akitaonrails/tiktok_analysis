package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_rust_rtc_msg_dispatch_setting")
public final class LinkMicRustRTCMsgDispatchSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicRustRTCMsgDispatchSetting INSTANCE = new LinkMicRustRTCMsgDispatchSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_rust_rtc_msg_dispatch_setting", DEFAULT);
    }
}
