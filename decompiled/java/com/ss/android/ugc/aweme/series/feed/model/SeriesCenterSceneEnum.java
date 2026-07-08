package com.ss.android.ugc.aweme.series.feed.model;

import X.C08FF;
import X.C09CT;
import X.C1578340rAu;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class SeriesCenterSceneEnum {

    @C09CT("1")
    public static final SeriesCenterSceneEnum ALL;

    @C09CT("3")
    public static final SeriesCenterSceneEnum CATEGORY;
    public static final C1578340rAu Companion;
    public static final /* synthetic */ SeriesCenterSceneEnum[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("5")
    public static final SeriesCenterSceneEnum MAIN;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final SeriesCenterSceneEnum NONE;

    @C09CT("4")
    public static final SeriesCenterSceneEnum PICKS;

    @C09CT("2")
    public static final SeriesCenterSceneEnum TREND;
    public final int LL;

    public static InterfaceC2044707zh<SeriesCenterSceneEnum> getEntries() {
        return LLILLL;
    }

    static {
        SeriesCenterSceneEnum seriesCenterSceneEnum = new SeriesCenterSceneEnum("NONE", 0, 0);
        NONE = seriesCenterSceneEnum;
        SeriesCenterSceneEnum seriesCenterSceneEnum2 = new SeriesCenterSceneEnum("ALL", 1, 1);
        ALL = seriesCenterSceneEnum2;
        SeriesCenterSceneEnum seriesCenterSceneEnum3 = new SeriesCenterSceneEnum("TREND", 2, 2);
        TREND = seriesCenterSceneEnum3;
        SeriesCenterSceneEnum seriesCenterSceneEnum4 = new SeriesCenterSceneEnum("CATEGORY", 3, 3);
        CATEGORY = seriesCenterSceneEnum4;
        SeriesCenterSceneEnum seriesCenterSceneEnum5 = new SeriesCenterSceneEnum("PICKS", 4, 4);
        PICKS = seriesCenterSceneEnum5;
        SeriesCenterSceneEnum seriesCenterSceneEnum6 = new SeriesCenterSceneEnum("MAIN", 5, 5);
        MAIN = seriesCenterSceneEnum6;
        SeriesCenterSceneEnum[] seriesCenterSceneEnumArr = {seriesCenterSceneEnum, seriesCenterSceneEnum2, seriesCenterSceneEnum3, seriesCenterSceneEnum4, seriesCenterSceneEnum5, seriesCenterSceneEnum6};
        LLILLJJLI = seriesCenterSceneEnumArr;
        LLILLL = new C2254308sP(seriesCenterSceneEnumArr);
        Companion = new C1578340rAu();
    }

    public static SeriesCenterSceneEnum[] values() {
        return (SeriesCenterSceneEnum[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static SeriesCenterSceneEnum valueOf(String str) {
        return (SeriesCenterSceneEnum) C08FF.LIZ(SeriesCenterSceneEnum.class, str);
    }

    public SeriesCenterSceneEnum(String str, int i, int i2) {
        this.LL = i2;
    }
}
