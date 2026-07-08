package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendInfo;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AddItemToCartData {

    @C09CT("auto_claimed_vouchers")
    public final List<Voucher> autoVouchers;

    @C09CT("cart_entry")
    public final CartEntry cartEntry;

    @C09CT("cart_item_id")
    public final String cartItemId;

    @C09CT("exception_ux")
    public final ExceptionUX exceptionUX;

    @C09CT("extra_info")
    public final AddItemExtra extra;

    @C09CT("operation_extra")
    public final AddItemOperationExtra operationExtra;

    @C09CT("post_sku_count")
    public final Integer postSkuCount;

    @C09CT("pre_sku_count")
    public final Integer preSkuCount;

    @C09CT("recommend_infos")
    public RecommendInfo recommendInfos;

    public AddItemToCartData(String str, ExceptionUX exceptionUX, CartEntry cartEntry, Integer num, Integer num2, List<Voucher> list, RecommendInfo recommendInfo, AddItemExtra addItemExtra, AddItemOperationExtra addItemOperationExtra) {
        this.cartItemId = str;
        this.exceptionUX = exceptionUX;
        this.cartEntry = cartEntry;
        this.preSkuCount = num;
        this.postSkuCount = num2;
        this.autoVouchers = list;
        this.recommendInfos = recommendInfo;
        this.extra = addItemExtra;
        this.operationExtra = addItemOperationExtra;
    }
}
