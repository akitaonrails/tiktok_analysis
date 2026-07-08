package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_panel_heartme_order_optz_ids")
public final class LiveGiftPanelHeartMeReorderIdsSetting {
    public static final LiveGiftPanelHeartMeReorderIdsSetting INSTANCE = new LiveGiftPanelHeartMeReorderIdsSetting();
    public static final String[] DEFAULT = {"7934"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_gift_panel_heartme_order_optz_ids", DEFAULT);
    }
}
