package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C1338270kvh;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_leads_ads_pin_card_mock")
public final class LiveLeadsAdsPinCardMockSetting {
    public static final int AUTO_OPEN_FORM_AND_SHOW_PIN_CARD = 2;
    public static final int DEFAULT = 0;
    public static final LiveLeadsAdsPinCardMockSetting INSTANCE = new LiveLeadsAdsPinCardMockSetting();
    public static final int SHOW_PIN_CARD_ONLY = 1;

    private final int value() {
        Map<String, Object> map = C1338270kvh.LIZ;
        return 0;
    }

    public final boolean shouldForceClickAdsPinCard() {
        return value() >= 2;
    }

    public final boolean shouldForceLeadsAdsTraffic() {
        return value() >= 1;
    }

    public final boolean shouldUseSubPinCardAsLeadsAdsPinCard() {
        return value() >= 1;
    }
}
