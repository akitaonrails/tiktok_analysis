package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class GetCartEntryResponseData {

    @C09CT("cart_benefits")
    public final List<CartBenefitInfo> cartBenefits;

    @C09CT("item_count")
    public final int itemCount;

    @C09CT("link")
    public final String link;

    public GetCartEntryResponseData(String str, int i, List<CartBenefitInfo> list) {
        this.link = str;
        this.itemCount = i;
        this.cartBenefits = list;
    }
}
