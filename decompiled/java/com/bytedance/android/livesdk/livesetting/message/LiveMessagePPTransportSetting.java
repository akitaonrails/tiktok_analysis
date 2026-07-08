package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_message_pp_transport")
public final class LiveMessagePPTransportSetting {
    public static final LiveMessagePPTransportSetting INSTANCE = new LiveMessagePPTransportSetting();
    public static final int DEFAULT = 3;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_message_pp_transport", DEFAULT);
    }
}
