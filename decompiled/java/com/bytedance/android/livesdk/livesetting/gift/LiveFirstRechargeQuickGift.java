package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_open_gift_panel_after_recharge")
public final class LiveFirstRechargeQuickGift {
    public static final int DEFAULT = 0;
    public static final int EXPERIMENT = 1;
    public static final LiveFirstRechargeQuickGift INSTANCE = new LiveFirstRechargeQuickGift();

    public final int getValue() {
        try {
            return SettingsManager.INSTANCE.getIntValue("live_open_gift_panel_after_recharge", DEFAULT);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public final boolean inExp() {
        return getValue() != 0;
    }
}
