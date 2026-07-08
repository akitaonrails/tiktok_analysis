package com.ss.android.ugc.aweme.series.vip.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SeriesSubscriptionModels$SubPeriodType {
    public static final /* synthetic */ SeriesSubscriptionModels$SubPeriodType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("2")
    public static final SeriesSubscriptionModels$SubPeriodType SUB_PERIOD_TYPE_MONTHLY;

    @C09CT("3")
    public static final SeriesSubscriptionModels$SubPeriodType SUB_PERIOD_TYPE_QUARTERLY;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final SeriesSubscriptionModels$SubPeriodType SUB_PERIOD_TYPE_UNKNOWN;

    @C09CT("1")
    public static final SeriesSubscriptionModels$SubPeriodType SUB_PERIOD_TYPE_WEEKLY;

    public static InterfaceC2044707zh<SeriesSubscriptionModels$SubPeriodType> getEntries() {
        return LLILLJJLI;
    }

    static {
        SeriesSubscriptionModels$SubPeriodType seriesSubscriptionModels$SubPeriodType = new SeriesSubscriptionModels$SubPeriodType("SUB_PERIOD_TYPE_UNKNOWN", 0);
        SUB_PERIOD_TYPE_UNKNOWN = seriesSubscriptionModels$SubPeriodType;
        SeriesSubscriptionModels$SubPeriodType seriesSubscriptionModels$SubPeriodType2 = new SeriesSubscriptionModels$SubPeriodType("SUB_PERIOD_TYPE_WEEKLY", 1);
        SUB_PERIOD_TYPE_WEEKLY = seriesSubscriptionModels$SubPeriodType2;
        SeriesSubscriptionModels$SubPeriodType seriesSubscriptionModels$SubPeriodType3 = new SeriesSubscriptionModels$SubPeriodType("SUB_PERIOD_TYPE_MONTHLY", 2);
        SUB_PERIOD_TYPE_MONTHLY = seriesSubscriptionModels$SubPeriodType3;
        SeriesSubscriptionModels$SubPeriodType seriesSubscriptionModels$SubPeriodType4 = new SeriesSubscriptionModels$SubPeriodType("SUB_PERIOD_TYPE_QUARTERLY", 3);
        SUB_PERIOD_TYPE_QUARTERLY = seriesSubscriptionModels$SubPeriodType4;
        SeriesSubscriptionModels$SubPeriodType[] seriesSubscriptionModels$SubPeriodTypeArr = {seriesSubscriptionModels$SubPeriodType, seriesSubscriptionModels$SubPeriodType2, seriesSubscriptionModels$SubPeriodType3, seriesSubscriptionModels$SubPeriodType4};
        LL = seriesSubscriptionModels$SubPeriodTypeArr;
        LLILLJJLI = new C2254308sP(seriesSubscriptionModels$SubPeriodTypeArr);
    }

    public static SeriesSubscriptionModels$SubPeriodType[] values() {
        return (SeriesSubscriptionModels$SubPeriodType[]) LL.clone();
    }

    public static SeriesSubscriptionModels$SubPeriodType valueOf(String str) {
        return (SeriesSubscriptionModels$SubPeriodType) C08FF.LIZ(SeriesSubscriptionModels$SubPeriodType.class, str);
    }

    public SeriesSubscriptionModels$SubPeriodType(String str, int i) {
    }
}
