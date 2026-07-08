package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_panel_fetch_when_close")
public final class LiveGiftPanelFetchListWhenCloseSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGiftPanelFetchListWhenCloseSetting INSTANCE = new LiveGiftPanelFetchListWhenCloseSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_panel_fetch_when_close", DEFAULT);
    }
}
