package com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SeriesVideoType {

    @C09CT("3")
    public static final SeriesVideoType FULL_PREVIEW;

    @C09CT("2")
    public static final SeriesVideoType INTRO;
    public static final /* synthetic */ SeriesVideoType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("5")
    public static final SeriesVideoType PAID;

    @C09CT("4")
    public static final SeriesVideoType PARTIAL_PREVIEW;

    @C09CT("1")
    public static final SeriesVideoType PROMOTIONAL;

    public static InterfaceC2044707zh<SeriesVideoType> getEntries() {
        return LLILLJJLI;
    }

    static {
        SeriesVideoType seriesVideoType = new SeriesVideoType("PROMOTIONAL", 0);
        PROMOTIONAL = seriesVideoType;
        SeriesVideoType seriesVideoType2 = new SeriesVideoType("INTRO", 1);
        INTRO = seriesVideoType2;
        SeriesVideoType seriesVideoType3 = new SeriesVideoType("FULL_PREVIEW", 2);
        FULL_PREVIEW = seriesVideoType3;
        SeriesVideoType seriesVideoType4 = new SeriesVideoType("PARTIAL_PREVIEW", 3);
        PARTIAL_PREVIEW = seriesVideoType4;
        SeriesVideoType seriesVideoType5 = new SeriesVideoType("PAID", 4);
        PAID = seriesVideoType5;
        SeriesVideoType[] seriesVideoTypeArr = {seriesVideoType, seriesVideoType2, seriesVideoType3, seriesVideoType4, seriesVideoType5};
        LL = seriesVideoTypeArr;
        LLILLJJLI = new C2254308sP(seriesVideoTypeArr);
    }

    public static SeriesVideoType[] values() {
        return (SeriesVideoType[]) LL.clone();
    }

    public static SeriesVideoType valueOf(String str) {
        return (SeriesVideoType) C08FF.LIZ(SeriesVideoType.class, str);
    }

    public SeriesVideoType(String str, int i) {
    }
}
