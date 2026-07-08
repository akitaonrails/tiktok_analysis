package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public class CancelRetentionTimeConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("min_recharge_panel_stay_duration_second")
    public int rechargePageStayMinDuration = 10;

    @C09CT("max_payment_cancel_duration_second")
    public int paymentCancelMaxDuration = 30;

    static {
        NormalGson.singleton();
        ADAPTER = new CancelRetentionTimeConfig_OptTypeAdapter();
    }
}
