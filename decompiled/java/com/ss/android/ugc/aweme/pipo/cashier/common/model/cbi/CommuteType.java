package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C08FF;
import X.C09CT;
import X.C1708560uYw;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes27.dex */
public final class CommuteType {

    @C09CT("2")
    public static final CommuteType APP;

    @C09CT("5")
    public static final CommuteType BROWSER2APP;

    @C09CT("1")
    public static final CommuteType INTERNAL;

    @C09CT("7")
    public static final CommuteType IN_APP_BROWSER;
    public static final /* synthetic */ CommuteType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final CommuteType NONE;

    @C09CT("3")
    public static final CommuteType WEB;

    @C09CT("4")
    public static final CommuteType WEB2APP;

    @C09CT("6")
    public static final CommuteType WEB_PAYMENT_CODE;

    public static InterfaceC2044707zh<CommuteType> getEntries() {
        return LLILLJJLI;
    }

    static {
        CommuteType commuteType = new CommuteType("NONE", 0);
        NONE = commuteType;
        CommuteType commuteType2 = new CommuteType("INTERNAL", 1);
        INTERNAL = commuteType2;
        CommuteType commuteType3 = new CommuteType("APP", 2);
        APP = commuteType3;
        CommuteType commuteType4 = new CommuteType("WEB", 3);
        WEB = commuteType4;
        CommuteType commuteType5 = new CommuteType("WEB2APP", 4);
        WEB2APP = commuteType5;
        CommuteType commuteType6 = new CommuteType("BROWSER2APP", 5);
        BROWSER2APP = commuteType6;
        CommuteType commuteType7 = new CommuteType("WEB_PAYMENT_CODE", 6);
        WEB_PAYMENT_CODE = commuteType7;
        CommuteType commuteType8 = new CommuteType("IN_APP_BROWSER", 7);
        IN_APP_BROWSER = commuteType8;
        CommuteType[] commuteTypeArr = {commuteType, commuteType2, commuteType3, commuteType4, commuteType5, commuteType6, commuteType7, commuteType8};
        LL = commuteTypeArr;
        LLILLJJLI = new C2254308sP(commuteTypeArr);
    }

    public static CommuteType[] values() {
        return (CommuteType[]) LL.clone();
    }

    public final int getValue() {
        switch (C1708560uYw.LIZ[ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            default:
                return 0;
        }
    }

    public static CommuteType valueOf(String str) {
        return (CommuteType) C08FF.LIZ(CommuteType.class, str);
    }

    public CommuteType(String str, int i) {
    }
}
