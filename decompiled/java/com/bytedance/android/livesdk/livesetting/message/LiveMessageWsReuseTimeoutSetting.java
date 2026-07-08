package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_ws_im_enter_room_timeout")
public final class LiveMessageWsReuseTimeoutSetting {
    public static final LiveMessageWsReuseTimeoutSetting INSTANCE = new LiveMessageWsReuseTimeoutSetting();
    public static final long DEFAULT = 3000;

    public final long wsImEnterRoomTimeout() {
        return SettingsManager.INSTANCE.getLongValue("live_ws_im_enter_room_timeout", DEFAULT);
    }
}
