package com.ss.android.ugc.aweme.model;

import X.C08FF;
import X.C09CT;
import X.C1613740s60;
import X.C2097908Jt;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class ContinueStatus {

    @C09CT("2")
    public static final ContinueStatus CONTINUE_WATCHING;
    public static final C1613740s60 Companion;
    public static final /* synthetic */ ContinueStatus[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("3")
    public static final ContinueStatus NEXT_VIDEO;

    @C09CT("4")
    public static final ContinueStatus SERIES_COMPLETED;

    @C09CT("1")
    public static final ContinueStatus START_WATCHING;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final ContinueStatus UNKNOWN;
    public static final Map<Integer, ContinueStatus> map;
    public final int LL;

    public static InterfaceC2044707zh<ContinueStatus> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0s60] */
    static {
        ContinueStatus continueStatus = new ContinueStatus("UNKNOWN", 0, 0);
        UNKNOWN = continueStatus;
        ContinueStatus continueStatus2 = new ContinueStatus("START_WATCHING", 1, 1);
        START_WATCHING = continueStatus2;
        ContinueStatus continueStatus3 = new ContinueStatus("CONTINUE_WATCHING", 2, 2);
        CONTINUE_WATCHING = continueStatus3;
        ContinueStatus continueStatus4 = new ContinueStatus("NEXT_VIDEO", 3, 3);
        NEXT_VIDEO = continueStatus4;
        ContinueStatus continueStatus5 = new ContinueStatus("SERIES_COMPLETED", 4, 4);
        SERIES_COMPLETED = continueStatus5;
        ContinueStatus[] continueStatusArr = {continueStatus, continueStatus2, continueStatus3, continueStatus4, continueStatus5};
        LLILLJJLI = continueStatusArr;
        LLILLL = new C2254308sP(continueStatusArr);
        Companion = new Object() { // from class: X.0s60
        };
        ContinueStatus[] continueStatusArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(continueStatusArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (ContinueStatus continueStatus6 : continueStatusArrValues) {
            linkedHashMap.put(Integer.valueOf(continueStatus6.LL), continueStatus6);
        }
        map = linkedHashMap;
    }

    public static ContinueStatus[] values() {
        return (ContinueStatus[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static ContinueStatus valueOf(String str) {
        return (ContinueStatus) C08FF.LIZ(ContinueStatus.class, str);
    }

    public ContinueStatus(String str, int i, int i2) {
        this.LL = i2;
    }
}
