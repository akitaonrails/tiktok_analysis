package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class WalletPaymentType {

    @C09CT("balance")
    public static final WalletPaymentType BALANCE;

    @C09CT("hybrid")
    public static final WalletPaymentType HYBRID;
    public static final /* synthetic */ WalletPaymentType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<WalletPaymentType> getEntries() {
        return LLILLJJLI;
    }

    static {
        WalletPaymentType walletPaymentType = new WalletPaymentType("BALANCE", 0);
        BALANCE = walletPaymentType;
        WalletPaymentType walletPaymentType2 = new WalletPaymentType("HYBRID", 1);
        HYBRID = walletPaymentType2;
        WalletPaymentType[] walletPaymentTypeArr = {walletPaymentType, walletPaymentType2};
        LL = walletPaymentTypeArr;
        LLILLJJLI = new C2254308sP(walletPaymentTypeArr);
    }

    public static WalletPaymentType[] values() {
        return (WalletPaymentType[]) LL.clone();
    }

    public static WalletPaymentType valueOf(String str) {
        return (WalletPaymentType) C08FF.LIZ(WalletPaymentType.class, str);
    }

    public WalletPaymentType(String str, int i) {
    }
}
