package com.bytedance.android.livesdk.firstrecharge;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.FXRate;

/* JADX INFO: loaded from: classes.dex */
public final class FirstRechargeResponse {

    @C09CT("data")
    public FirstChargeData data;

    @C09CT("extra")
    public FirstChargeExtra extra;

    public static final class FirstChargeExtra {

        @C09CT("multi_currency_display_fx_rate_list")
        public List<FXRate> multiCurrencyDisplayFxRateList = new ArrayList();

        @C09CT("need_display_multi_currency")
        public boolean needDisplayMultiCurrency;
    }
}
