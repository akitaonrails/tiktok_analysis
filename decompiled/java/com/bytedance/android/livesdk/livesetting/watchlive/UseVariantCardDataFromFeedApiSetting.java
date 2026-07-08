package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("use_variant_card_data_from_feed_api")
public final class UseVariantCardDataFromFeedApiSetting {
    public static final boolean DEFAULT = false;
    public static final UseVariantCardDataFromFeedApiSetting INSTANCE = new UseVariantCardDataFromFeedApiSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("use_variant_card_data_from_feed_api", DEFAULT);
    }
}
