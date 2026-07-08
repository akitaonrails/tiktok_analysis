package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PriceInfoRequestParams {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("bill_items")
    public final List<BillItem> billItems;

    @C09CT("invisible_params")
    public final String invisibleParams;

    @C09CT("payment_before_pay_promotion")
    public final Price paymentBeforePayPromotion;

    @C09CT("total")
    public final Price total;

    public PriceInfoRequestParams(List<BillItem> list, Price price, Price price2, String str) {
        this.billItems = list;
        this.total = price;
        this.paymentBeforePayPromotion = price2;
        this.invisibleParams = str;
    }
}
