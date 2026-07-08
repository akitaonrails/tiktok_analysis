package com.ss.android.ugc.aweme.series.vip.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SeriesSubscriptionModels$SubBillingMode {
    public static final /* synthetic */ SeriesSubscriptionModels$SubBillingMode[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("2")
    public static final SeriesSubscriptionModels$SubBillingMode SUB_BILLING_MODE_AUTO_RENEWAL;

    @C09CT("1")
    public static final SeriesSubscriptionModels$SubBillingMode SUB_BILLING_MODE_ONE_TIME;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final SeriesSubscriptionModels$SubBillingMode SUB_BILLING_MODE_UNKNOWN;

    public static InterfaceC2044707zh<SeriesSubscriptionModels$SubBillingMode> getEntries() {
        return LLILLJJLI;
    }

    static {
        SeriesSubscriptionModels$SubBillingMode seriesSubscriptionModels$SubBillingMode = new SeriesSubscriptionModels$SubBillingMode("SUB_BILLING_MODE_UNKNOWN", 0);
        SUB_BILLING_MODE_UNKNOWN = seriesSubscriptionModels$SubBillingMode;
        SeriesSubscriptionModels$SubBillingMode seriesSubscriptionModels$SubBillingMode2 = new SeriesSubscriptionModels$SubBillingMode("SUB_BILLING_MODE_ONE_TIME", 1);
        SUB_BILLING_MODE_ONE_TIME = seriesSubscriptionModels$SubBillingMode2;
        SeriesSubscriptionModels$SubBillingMode seriesSubscriptionModels$SubBillingMode3 = new SeriesSubscriptionModels$SubBillingMode("SUB_BILLING_MODE_AUTO_RENEWAL", 2);
        SUB_BILLING_MODE_AUTO_RENEWAL = seriesSubscriptionModels$SubBillingMode3;
        SeriesSubscriptionModels$SubBillingMode[] seriesSubscriptionModels$SubBillingModeArr = {seriesSubscriptionModels$SubBillingMode, seriesSubscriptionModels$SubBillingMode2, seriesSubscriptionModels$SubBillingMode3};
        LL = seriesSubscriptionModels$SubBillingModeArr;
        LLILLJJLI = new C2254308sP(seriesSubscriptionModels$SubBillingModeArr);
    }

    public static SeriesSubscriptionModels$SubBillingMode[] values() {
        return (SeriesSubscriptionModels$SubBillingMode[]) LL.clone();
    }

    public static SeriesSubscriptionModels$SubBillingMode valueOf(String str) {
        return (SeriesSubscriptionModels$SubBillingMode) C08FF.LIZ(SeriesSubscriptionModels$SubBillingMode.class, str);
    }

    public SeriesSubscriptionModels$SubBillingMode(String str, int i) {
    }
}
