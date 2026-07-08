package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C02RY;
import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class PaymentBillSummaryType {

    @C09CT("2")
    public static final PaymentBillSummaryType COMBINATION;
    public static final C02RY Companion;
    public static final /* synthetic */ PaymentBillSummaryType[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("1")
    public static final PaymentBillSummaryType SINGLE;
    public final int LL;

    public static InterfaceC2044707zh<PaymentBillSummaryType> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.02RY] */
    static {
        PaymentBillSummaryType paymentBillSummaryType = new PaymentBillSummaryType("SINGLE", 0, 1);
        SINGLE = paymentBillSummaryType;
        PaymentBillSummaryType paymentBillSummaryType2 = new PaymentBillSummaryType("COMBINATION", 1, 2);
        COMBINATION = paymentBillSummaryType2;
        PaymentBillSummaryType[] paymentBillSummaryTypeArr = {paymentBillSummaryType, paymentBillSummaryType2};
        LLILLJJLI = paymentBillSummaryTypeArr;
        LLILLL = new C2254308sP(paymentBillSummaryTypeArr);
        Companion = new Object() { // from class: X.02RY
        };
    }

    public static PaymentBillSummaryType[] values() {
        return (PaymentBillSummaryType[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static PaymentBillSummaryType valueOf(String str) {
        return (PaymentBillSummaryType) C08FF.LIZ(PaymentBillSummaryType.class, str);
    }

    public PaymentBillSummaryType(String str, int i, int i2) {
        this.LL = i2;
    }
}
