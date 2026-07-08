package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("remove_next_variant_card")
public final class RemoveNextVariantCardSetting {
    public static final boolean DEFAULT = false;
    public static final RemoveNextVariantCardSetting INSTANCE = new RemoveNextVariantCardSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("remove_next_variant_card", DEFAULT);
    }
}
