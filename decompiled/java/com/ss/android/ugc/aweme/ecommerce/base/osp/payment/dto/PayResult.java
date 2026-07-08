package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class PayResult {

    @C09CT("1")
    public static final PayResult DONE;

    @C09CT("5")
    public static final PayResult ERROR;

    @C09CT("4")
    public static final PayResult IS_DEEPLINK;
    public static final /* synthetic */ PayResult[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("3")
    public static final PayResult NEED_INFO;

    @C09CT("9")
    public static final PayResult NEED_PIPO_VERIFICATION_SDK;

    @C09CT("8")
    public static final PayResult NEED_VERIFY;

    @C09CT("7")
    public static final PayResult PENDING;

    @C09CT("12")
    public static final PayResult PIX_VIA_GOOGLE_PAY;

    @C09CT("2")
    public static final PayResult REDIRECT;

    @C09CT("10")
    public static final PayResult SUCCESS;

    @C09CT("11")
    public static final PayResult TRADE_SUCCESS;

    public static InterfaceC2044707zh<PayResult> getEntries() {
        return LLILLJJLI;
    }

    static {
        PayResult payResult = new PayResult("DONE", 0);
        DONE = payResult;
        PayResult payResult2 = new PayResult("REDIRECT", 1);
        REDIRECT = payResult2;
        PayResult payResult3 = new PayResult("NEED_INFO", 2);
        NEED_INFO = payResult3;
        PayResult payResult4 = new PayResult("IS_DEEPLINK", 3);
        IS_DEEPLINK = payResult4;
        PayResult payResult5 = new PayResult("ERROR", 4);
        ERROR = payResult5;
        PayResult payResult6 = new PayResult("PENDING", 5);
        PENDING = payResult6;
        PayResult payResult7 = new PayResult("NEED_VERIFY", 6);
        NEED_VERIFY = payResult7;
        PayResult payResult8 = new PayResult("NEED_PIPO_VERIFICATION_SDK", 7);
        NEED_PIPO_VERIFICATION_SDK = payResult8;
        PayResult payResult9 = new PayResult("SUCCESS", 8);
        SUCCESS = payResult9;
        PayResult payResult10 = new PayResult("TRADE_SUCCESS", 9);
        TRADE_SUCCESS = payResult10;
        PayResult payResult11 = new PayResult("PIX_VIA_GOOGLE_PAY", 10);
        PIX_VIA_GOOGLE_PAY = payResult11;
        PayResult[] payResultArr = {payResult, payResult2, payResult3, payResult4, payResult5, payResult6, payResult7, payResult8, payResult9, payResult10, payResult11};
        LL = payResultArr;
        LLILLJJLI = new C2254308sP(payResultArr);
    }

    public static PayResult[] values() {
        return (PayResult[]) LL.clone();
    }

    public static PayResult valueOf(String str) {
        return (PayResult) C08FF.LIZ(PayResult.class, str);
    }

    public PayResult(String str, int i) {
    }
}
