package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_outfit_gift_enable")
public final class LiveGiftOutfitEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGiftOutfitEnableSetting INSTANCE = new LiveGiftOutfitEnableSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_outfit_gift_enable", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
