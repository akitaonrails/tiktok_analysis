package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("link_mic_state_send_delay")
public final class LinkMicStateSendDelaySetting {
    public static final long DEFAULT = 500;
    public static final LinkMicStateSendDelaySetting INSTANCE = new LinkMicStateSendDelaySetting();

    public static final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("link_mic_state_send_delay", DEFAULT);
    }
}
