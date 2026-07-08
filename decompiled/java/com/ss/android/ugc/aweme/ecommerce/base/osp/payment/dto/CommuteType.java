package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C02RO;
import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class CommuteType {

    @C09CT("1")
    public static final CommuteType APP;

    @C09CT("13")
    public static final CommuteType APP_DISPLAY_TIPS_IF_NOT_INSTALL;

    @C09CT("12")
    public static final CommuteType APP_LINK;

    @C09CT("16")
    public static final CommuteType APP_NO_FILTER;

    @C09CT("20")
    public static final CommuteType APP_NO_FILTER_V2;

    @C09CT("6")
    public static final CommuteType APP_PUSH;

    @C09CT("11")
    public static final CommuteType BROWSER_TO_APP;
    public static final C02RO Companion;

    @C09CT("17")
    public static final CommuteType INAPP_BROWSER;

    @C09CT("19")
    public static final CommuteType INSTALLATION_CHECK_NO_FILTER;

    @C09CT("14")
    public static final CommuteType INTERNAL_NATIVE;
    public static final /* synthetic */ CommuteType[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("3")
    public static final CommuteType SDK;

    @C09CT("15")
    public static final CommuteType SDK_WAP;

    @C09CT("4")
    public static final CommuteType SECRET_FREE;

    @C09CT("9")
    public static final CommuteType SECRET_FREE_APP;

    @C09CT("2")
    public static final CommuteType WAP;

    @C09CT("10")
    public static final CommuteType WAP_BOLETO_PIX;

    @C09CT("8")
    public static final CommuteType WAP_FILTER_APP;

    @C09CT("7")
    public static final CommuteType WAP_TO_APP;
    public final String LL;

    public static InterfaceC2044707zh<CommuteType> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [X.02RO] */
    static {
        CommuteType commuteType = new CommuteType("APP", 0, "1");
        APP = commuteType;
        CommuteType commuteType2 = new CommuteType("WAP", 1, "2");
        WAP = commuteType2;
        CommuteType commuteType3 = new CommuteType("SDK", 2, "3");
        SDK = commuteType3;
        CommuteType commuteType4 = new CommuteType("SECRET_FREE", 3, "4");
        SECRET_FREE = commuteType4;
        CommuteType commuteType5 = new CommuteType("APP_PUSH", 4, "6");
        APP_PUSH = commuteType5;
        CommuteType commuteType6 = new CommuteType("WAP_TO_APP", 5, "7");
        WAP_TO_APP = commuteType6;
        CommuteType commuteType7 = new CommuteType("WAP_FILTER_APP", 6, "8");
        WAP_FILTER_APP = commuteType7;
        CommuteType commuteType8 = new CommuteType("SECRET_FREE_APP", 7, "9");
        SECRET_FREE_APP = commuteType8;
        CommuteType commuteType9 = new CommuteType("WAP_BOLETO_PIX", 8, "10");
        WAP_BOLETO_PIX = commuteType9;
        CommuteType commuteType10 = new CommuteType("BROWSER_TO_APP", 9, "11");
        BROWSER_TO_APP = commuteType10;
        CommuteType commuteType11 = new CommuteType("APP_LINK", 10, "12");
        APP_LINK = commuteType11;
        CommuteType commuteType12 = new CommuteType("APP_DISPLAY_TIPS_IF_NOT_INSTALL", 11, "13");
        APP_DISPLAY_TIPS_IF_NOT_INSTALL = commuteType12;
        CommuteType commuteType13 = new CommuteType("INTERNAL_NATIVE", 12, "14");
        INTERNAL_NATIVE = commuteType13;
        CommuteType commuteType14 = new CommuteType("SDK_WAP", 13, "15");
        SDK_WAP = commuteType14;
        CommuteType commuteType15 = new CommuteType("APP_NO_FILTER", 14, "16");
        APP_NO_FILTER = commuteType15;
        CommuteType commuteType16 = new CommuteType("INAPP_BROWSER", 15, "17");
        INAPP_BROWSER = commuteType16;
        CommuteType commuteType17 = new CommuteType("INSTALLATION_CHECK_NO_FILTER", 16, "19");
        INSTALLATION_CHECK_NO_FILTER = commuteType17;
        CommuteType commuteType18 = new CommuteType("APP_NO_FILTER_V2", 17, "20");
        APP_NO_FILTER_V2 = commuteType18;
        CommuteType[] commuteTypeArr = {commuteType, commuteType2, commuteType3, commuteType4, commuteType5, commuteType6, commuteType7, commuteType8, commuteType9, commuteType10, commuteType11, commuteType12, commuteType13, commuteType14, commuteType15, commuteType16, commuteType17, commuteType18};
        LLILLJJLI = commuteTypeArr;
        LLILLL = new C2254308sP(commuteTypeArr);
        Companion = new Object() { // from class: X.02RO
        };
    }

    public static CommuteType[] values() {
        return (CommuteType[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static CommuteType valueOf(String str) {
        return (CommuteType) C08FF.LIZ(CommuteType.class, str);
    }

    public CommuteType(String str, int i, String str2) {
        this.LL = str2;
    }
}
