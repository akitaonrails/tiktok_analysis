package com.ss.android.ugc.aweme.ecommerce.base.osp.auction;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.TitleTips;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Payment {

    @C09CT("stored_methods")
    public final List<PaymentMethod> storedMethods;

    @C09CT("title_tips")
    public final TitleTips titleTips;

    public Payment(List<PaymentMethod> list, TitleTips titleTips) {
        this.storedMethods = list;
        this.titleTips = titleTips;
    }
}
