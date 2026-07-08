package com.ss.android.ugc.aweme.series.vip.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SeriesSubscriptionModels$TradeBizLine {
    public static final /* synthetic */ SeriesSubscriptionModels$TradeBizLine[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("1")
    public static final SeriesSubscriptionModels$TradeBizLine TRADE_BIZ_LINE_SHORT_DRAMA_BUY_OUT;

    @C09CT("2")
    public static final SeriesSubscriptionModels$TradeBizLine TRADE_BIZ_LINE_SHORT_DRAMA_SUBSCRIPTION;
    public final int LL;

    public static InterfaceC2044707zh<SeriesSubscriptionModels$TradeBizLine> getEntries() {
        return LLILLL;
    }

    static {
        SeriesSubscriptionModels$TradeBizLine seriesSubscriptionModels$TradeBizLine = new SeriesSubscriptionModels$TradeBizLine("TRADE_BIZ_LINE_SHORT_DRAMA_BUY_OUT", 0, 1);
        TRADE_BIZ_LINE_SHORT_DRAMA_BUY_OUT = seriesSubscriptionModels$TradeBizLine;
        SeriesSubscriptionModels$TradeBizLine seriesSubscriptionModels$TradeBizLine2 = new SeriesSubscriptionModels$TradeBizLine("TRADE_BIZ_LINE_SHORT_DRAMA_SUBSCRIPTION", 1, 2);
        TRADE_BIZ_LINE_SHORT_DRAMA_SUBSCRIPTION = seriesSubscriptionModels$TradeBizLine2;
        SeriesSubscriptionModels$TradeBizLine[] seriesSubscriptionModels$TradeBizLineArr = {seriesSubscriptionModels$TradeBizLine, seriesSubscriptionModels$TradeBizLine2};
        LLILLJJLI = seriesSubscriptionModels$TradeBizLineArr;
        LLILLL = new C2254308sP(seriesSubscriptionModels$TradeBizLineArr);
    }

    public static SeriesSubscriptionModels$TradeBizLine[] values() {
        return (SeriesSubscriptionModels$TradeBizLine[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static SeriesSubscriptionModels$TradeBizLine valueOf(String str) {
        return (SeriesSubscriptionModels$TradeBizLine) C08FF.LIZ(SeriesSubscriptionModels$TradeBizLine.class, str);
    }

    public SeriesSubscriptionModels$TradeBizLine(String str, int i, int i2) {
        this.LL = i2;
    }
}
