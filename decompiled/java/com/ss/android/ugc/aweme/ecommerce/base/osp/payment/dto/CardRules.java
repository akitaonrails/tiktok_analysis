package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CardRules {

    @C09CT("payment_method_id")
    public String id;

    @C09CT("sub_payment_card_rules")
    public List<BankCardRule> rules;

    public CardRules() {
    }

    public CardRules(String str, List<BankCardRule> list) {
        this.id = str;
        this.rules = list;
    }
}
