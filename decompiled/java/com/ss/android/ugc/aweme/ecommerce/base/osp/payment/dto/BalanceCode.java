package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class BalanceCode {

    @C09CT("3")
    public static final BalanceCode BALANCE_INSUFFICIENT;

    @C09CT("2")
    public static final BalanceCode BALANCE_SUFFICIENT;
    public static final /* synthetic */ BalanceCode[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("1")
    public static final BalanceCode NO_BALANCE;

    public static InterfaceC2044707zh<BalanceCode> getEntries() {
        return LLILLJJLI;
    }

    static {
        BalanceCode balanceCode = new BalanceCode("NO_BALANCE", 0);
        NO_BALANCE = balanceCode;
        BalanceCode balanceCode2 = new BalanceCode("BALANCE_SUFFICIENT", 1);
        BALANCE_SUFFICIENT = balanceCode2;
        BalanceCode balanceCode3 = new BalanceCode("BALANCE_INSUFFICIENT", 2);
        BALANCE_INSUFFICIENT = balanceCode3;
        BalanceCode[] balanceCodeArr = {balanceCode, balanceCode2, balanceCode3};
        LL = balanceCodeArr;
        LLILLJJLI = new C2254308sP(balanceCodeArr);
    }

    public static BalanceCode[] values() {
        return (BalanceCode[]) LL.clone();
    }

    public static BalanceCode valueOf(String str) {
        return (BalanceCode) C08FF.LIZ(BalanceCode.class, str);
    }

    public BalanceCode(String str, int i) {
    }
}
