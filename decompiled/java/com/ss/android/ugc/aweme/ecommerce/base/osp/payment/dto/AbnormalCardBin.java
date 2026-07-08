package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AbnormalCardBin {

    @C09CT("abnormal_card_bin")
    public String cardBin;

    @C09CT("payment_tips")
    public List<PaymentTip> paymentTips;

    public AbnormalCardBin() {
    }

    public AbnormalCardBin(String str, List<PaymentTip> list) {
        this.cardBin = str;
        this.paymentTips = list;
    }
}
