package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_sub_mock_empty_offer_token")
public final class LiveSubMockEmptyOfferTokenTestSetting {
    public static final boolean DEFAULT = false;
    public static final boolean EMPTY = true;
    public static final LiveSubMockEmptyOfferTokenTestSetting INSTANCE = new LiveSubMockEmptyOfferTokenTestSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sub_mock_empty_offer_token", DEFAULT);
    }
}
