package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_use_new_gift_tray_v3")
public final class GiftUseNewGiftTrayV3 {
    public static final GiftUseNewGiftTrayV3 INSTANCE = new GiftUseNewGiftTrayV3();
    public static final int DEFAULT = 1;
    public static final int PHASE2 = 2;
    public static final int config = SettingsManager.INSTANCE.getIntValue("gift_use_new_gift_tray_v3", 1);

    public final boolean isPhaseTwo() {
        return config == PHASE2;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getPHASE2() {
        return PHASE2;
    }
}
