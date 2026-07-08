package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class HybridInfo {

    @C09CT("payment_methods")
    public final List<CBIPaymentMethod> cashierPaymentMethods;

    @C09CT("stored_payment_methods")
    public final List<CBIPaymentMethod> cashierStoredPaymentMethods;

    @C09CT("need_select_other_block")
    public final CBIDescriptionBlock needSelectOtherBlock;

    @C09CT("wallet_payment_amount")
    public final String walletPaymentAmount;

    @C09CT("wallet_payment_amount_display_text")
    public final String walletPaymentAmountDisplayText;

    @C09CT("wallet_payment_type")
    public final WalletPaymentType walletPaymentType;

    public HybridInfo() {
        this(WalletPaymentType.BALANCE, null, null, null, null, null);
    }

    public HybridInfo(WalletPaymentType walletPaymentType, String str, String str2, CBIDescriptionBlock cBIDescriptionBlock, List<CBIPaymentMethod> list, List<CBIPaymentMethod> list2) {
        this.walletPaymentType = walletPaymentType;
        this.walletPaymentAmountDisplayText = str;
        this.walletPaymentAmount = str2;
        this.needSelectOtherBlock = cBIDescriptionBlock;
        this.cashierPaymentMethods = list;
        this.cashierStoredPaymentMethods = list2;
    }
}
