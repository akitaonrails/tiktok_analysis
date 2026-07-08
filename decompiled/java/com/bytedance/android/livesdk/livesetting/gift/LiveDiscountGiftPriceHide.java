package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_discount_gift_price_hide")
public final class LiveDiscountGiftPriceHide {
    public static final int DEFAULT = 0;
    public static final int EXPERIMENT = 1;
    public static final LiveDiscountGiftPriceHide INSTANCE = new LiveDiscountGiftPriceHide();

    public final int getValue() {
        try {
            return SettingsManager.INSTANCE.getIntValue("live_discount_gift_price_hide", DEFAULT);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public final boolean newUi() {
        return getValue() != 0;
    }
}
