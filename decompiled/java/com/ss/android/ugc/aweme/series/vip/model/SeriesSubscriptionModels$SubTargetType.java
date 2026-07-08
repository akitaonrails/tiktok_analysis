package com.ss.android.ugc.aweme.series.vip.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SeriesSubscriptionModels$SubTargetType {
    public static final /* synthetic */ SeriesSubscriptionModels$SubTargetType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("1")
    public static final SeriesSubscriptionModels$SubTargetType SUB_TARGET_TYPE_CREATOR;

    @C09CT("2")
    public static final SeriesSubscriptionModels$SubTargetType SUB_TARGET_TYPE_PLATFORM;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final SeriesSubscriptionModels$SubTargetType SUB_TARGET_TYPE_UNKNOWN;

    public static InterfaceC2044707zh<SeriesSubscriptionModels$SubTargetType> getEntries() {
        return LLILLJJLI;
    }

    static {
        SeriesSubscriptionModels$SubTargetType seriesSubscriptionModels$SubTargetType = new SeriesSubscriptionModels$SubTargetType("SUB_TARGET_TYPE_UNKNOWN", 0);
        SUB_TARGET_TYPE_UNKNOWN = seriesSubscriptionModels$SubTargetType;
        SeriesSubscriptionModels$SubTargetType seriesSubscriptionModels$SubTargetType2 = new SeriesSubscriptionModels$SubTargetType("SUB_TARGET_TYPE_CREATOR", 1);
        SUB_TARGET_TYPE_CREATOR = seriesSubscriptionModels$SubTargetType2;
        SeriesSubscriptionModels$SubTargetType seriesSubscriptionModels$SubTargetType3 = new SeriesSubscriptionModels$SubTargetType("SUB_TARGET_TYPE_PLATFORM", 2);
        SUB_TARGET_TYPE_PLATFORM = seriesSubscriptionModels$SubTargetType3;
        SeriesSubscriptionModels$SubTargetType[] seriesSubscriptionModels$SubTargetTypeArr = {seriesSubscriptionModels$SubTargetType, seriesSubscriptionModels$SubTargetType2, seriesSubscriptionModels$SubTargetType3};
        LL = seriesSubscriptionModels$SubTargetTypeArr;
        LLILLJJLI = new C2254308sP(seriesSubscriptionModels$SubTargetTypeArr);
    }

    public static SeriesSubscriptionModels$SubTargetType[] values() {
        return (SeriesSubscriptionModels$SubTargetType[]) LL.clone();
    }

    public static SeriesSubscriptionModels$SubTargetType valueOf(String str) {
        return (SeriesSubscriptionModels$SubTargetType) C08FF.LIZ(SeriesSubscriptionModels$SubTargetType.class, str);
    }

    public SeriesSubscriptionModels$SubTargetType(String str, int i) {
    }
}
