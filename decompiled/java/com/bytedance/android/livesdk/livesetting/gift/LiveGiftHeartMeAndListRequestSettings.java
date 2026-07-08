package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_panel_heartme_order_optz")
public final class LiveGiftHeartMeAndListRequestSettings {
    public static final boolean DEFAULT = false;
    public static final LiveGiftHeartMeAndListRequestSettings INSTANCE = new LiveGiftHeartMeAndListRequestSettings();

    public final boolean enableReorderHeartMe() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_panel_heartme_order_optz", DEFAULT);
    }
}
