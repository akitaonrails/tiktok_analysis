package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttls_pusher_send_sei_opt")
public final class TTLSPusherSendSeiOptSetting {
    public static final int DEFAULT = 0;
    public static final TTLSPusherSendSeiOptSetting INSTANCE = new TTLSPusherSendSeiOptSetting();

    public final boolean enablePusherSendSeiOpt() {
        return SettingsManager.INSTANCE.getIntValue("ttls_pusher_send_sei_opt", DEFAULT) == 1;
    }
}
