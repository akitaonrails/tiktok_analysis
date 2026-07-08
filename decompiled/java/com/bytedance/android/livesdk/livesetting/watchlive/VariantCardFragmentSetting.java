package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("enable_variant_card_fragment")
public final class VariantCardFragmentSetting {
    public static final boolean DEFAULT = false;
    public static final VariantCardFragmentSetting INSTANCE = new VariantCardFragmentSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_variant_card_fragment", DEFAULT);
    }
}
