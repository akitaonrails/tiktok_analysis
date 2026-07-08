package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fe_websocket_black_list")
public final class LiveFEWebSocketBlackList {
    public static final FEWebsocketConfig DEFAULT;
    public static final LiveFEWebSocketBlackList INSTANCE = new LiveFEWebSocketBlackList();
    public static FEWebsocketConfig value;

    static {
        FEWebsocketConfig fEWebsocketConfig = new FEWebsocketConfig(C13BV.INSTANCE);
        DEFAULT = fEWebsocketConfig;
        FEWebsocketConfig fEWebsocketConfig2 = (FEWebsocketConfig) SettingsManager.INSTANCE.getValueSafely("live_fe_websocket_black_list", fEWebsocketConfig);
        if (fEWebsocketConfig2 != null) {
            fEWebsocketConfig = fEWebsocketConfig2;
        }
        value = fEWebsocketConfig;
    }

    public final boolean shouldBlock(int i, int i2) {
        for (FEWebsocketKV fEWebsocketKV : value.kvList) {
            FEWebsocketKV fEWebsocketKV2 = fEWebsocketKV;
            if (fEWebsocketKV2.serviceId == i && fEWebsocketKV2.methodId == i2) {
                if (fEWebsocketKV != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
