package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C02RN;
import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class CciCashierDisplayType {
    public static final C02RN Companion;

    @C09CT("3")
    public static final CciCashierDisplayType DIFFERENT_ENTRANCE_WITH_CCDC_CHECK_CARD_TYPE;

    @C09CT("5")
    public static final CciCashierDisplayType DIFFERENT_ENTRANCE_WITH_CCDC_CHECK_CARD_TYPE_MX;

    @C09CT("1")
    public static final CciCashierDisplayType DIFFERENT_ENTRANCE_WITH_CCDC_HAVE_BANK_CODE;

    @C09CT("2")
    public static final CciCashierDisplayType DIFFERENT_ENTRANCE_WITH_CCDC_NO_BANK_CODE;
    public static final /* synthetic */ CciCashierDisplayType[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final CciCashierDisplayType NO_CCI_ENTRANCE;

    @C09CT("4")
    public static final CciCashierDisplayType SAME_ENTRANCE_WITH_CCDC_HAVE_BANK_CODE;

    @C09CT("6")
    public static final CciCashierDisplayType SAME_ENTRANCE_WITH_CCDC_WITH_REAL_BINDING;
    public final int LL;

    public static InterfaceC2044707zh<CciCashierDisplayType> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.02RN] */
    static {
        CciCashierDisplayType cciCashierDisplayType = new CciCashierDisplayType("NO_CCI_ENTRANCE", 0, 0);
        NO_CCI_ENTRANCE = cciCashierDisplayType;
        CciCashierDisplayType cciCashierDisplayType2 = new CciCashierDisplayType("DIFFERENT_ENTRANCE_WITH_CCDC_HAVE_BANK_CODE", 1, 1);
        DIFFERENT_ENTRANCE_WITH_CCDC_HAVE_BANK_CODE = cciCashierDisplayType2;
        CciCashierDisplayType cciCashierDisplayType3 = new CciCashierDisplayType("DIFFERENT_ENTRANCE_WITH_CCDC_NO_BANK_CODE", 2, 2);
        DIFFERENT_ENTRANCE_WITH_CCDC_NO_BANK_CODE = cciCashierDisplayType3;
        CciCashierDisplayType cciCashierDisplayType4 = new CciCashierDisplayType("DIFFERENT_ENTRANCE_WITH_CCDC_CHECK_CARD_TYPE", 3, 3);
        DIFFERENT_ENTRANCE_WITH_CCDC_CHECK_CARD_TYPE = cciCashierDisplayType4;
        CciCashierDisplayType cciCashierDisplayType5 = new CciCashierDisplayType("SAME_ENTRANCE_WITH_CCDC_HAVE_BANK_CODE", 4, 4);
        SAME_ENTRANCE_WITH_CCDC_HAVE_BANK_CODE = cciCashierDisplayType5;
        CciCashierDisplayType cciCashierDisplayType6 = new CciCashierDisplayType("DIFFERENT_ENTRANCE_WITH_CCDC_CHECK_CARD_TYPE_MX", 5, 5);
        DIFFERENT_ENTRANCE_WITH_CCDC_CHECK_CARD_TYPE_MX = cciCashierDisplayType6;
        CciCashierDisplayType cciCashierDisplayType7 = new CciCashierDisplayType("SAME_ENTRANCE_WITH_CCDC_WITH_REAL_BINDING", 6, 6);
        SAME_ENTRANCE_WITH_CCDC_WITH_REAL_BINDING = cciCashierDisplayType7;
        CciCashierDisplayType[] cciCashierDisplayTypeArr = {cciCashierDisplayType, cciCashierDisplayType2, cciCashierDisplayType3, cciCashierDisplayType4, cciCashierDisplayType5, cciCashierDisplayType6, cciCashierDisplayType7};
        LLILLJJLI = cciCashierDisplayTypeArr;
        LLILLL = new C2254308sP(cciCashierDisplayTypeArr);
        Companion = new Object() { // from class: X.02RN
        };
    }

    public static CciCashierDisplayType[] values() {
        return (CciCashierDisplayType[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static CciCashierDisplayType valueOf(String str) {
        return (CciCashierDisplayType) C08FF.LIZ(CciCashierDisplayType.class, str);
    }

    public CciCashierDisplayType(String str, int i, int i2) {
        this.LL = i2;
    }
}
