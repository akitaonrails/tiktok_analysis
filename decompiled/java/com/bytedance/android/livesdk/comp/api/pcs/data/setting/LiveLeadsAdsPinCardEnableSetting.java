package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_leads_ads_pin_card_enable")
public final class LiveLeadsAdsPinCardEnableSetting {
    public static final boolean DEFAULT = false;
    public static final boolean ENABLE = true;
    public static final LiveLeadsAdsPinCardEnableSetting INSTANCE = new LiveLeadsAdsPinCardEnableSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_leads_ads_pin_card_enable", DEFAULT);
    }
}
