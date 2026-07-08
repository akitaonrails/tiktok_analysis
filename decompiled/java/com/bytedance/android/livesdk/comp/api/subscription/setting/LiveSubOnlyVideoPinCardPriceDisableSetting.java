package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sub_only_video_pin_card_price_disable")
public final class LiveSubOnlyVideoPinCardPriceDisableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSubOnlyVideoPinCardPriceDisableSetting INSTANCE = new LiveSubOnlyVideoPinCardPriceDisableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sub_only_video_pin_card_price_disable", DEFAULT);
    }
}
