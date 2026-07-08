package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("end_live_income_use_websocket")
public final class LiveEndLiveWsEnableSwitch {
    public static final LiveEndLiveWsEnableSwitch INSTANCE = new LiveEndLiveWsEnableSwitch();
    public static final int DEFAULT = 0;
    public static int value = SettingsManager.INSTANCE.getIntValue("end_live_income_use_websocket", DEFAULT);

    public final boolean enableMockResponse() {
        return value == 999;
    }

    public final boolean isEnable() {
        return value > 0;
    }
}
