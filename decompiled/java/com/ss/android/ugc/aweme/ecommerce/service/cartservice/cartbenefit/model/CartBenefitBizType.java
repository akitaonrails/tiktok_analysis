package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class CartBenefitBizType {

    @C09CT("1")
    public static final CartBenefitBizType CART_FREE_SHIPPING;

    @C09CT("7")
    public static final CartBenefitBizType CART_PROMOTION_DISCOUNT;

    @C09CT("6")
    public static final CartBenefitBizType CART_SAVE_OFF;

    @C09CT("2")
    public static final CartBenefitBizType CART_SHIPPING_VOUCHER;

    @C09CT("8")
    public static final CartBenefitBizType DIRECT_SUBSIDY;

    @C09CT("5")
    public static final CartBenefitBizType ITEM_LOW_STOCK;

    @C09CT("4")
    public static final CartBenefitBizType ITEM_PRICE_DROP;
    public static final /* synthetic */ CartBenefitBizType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final CartBenefitBizType UNKNOWN;

    @C09CT("3")
    public static final CartBenefitBizType UNPAID_ITEM;

    public static InterfaceC2044707zh<CartBenefitBizType> getEntries() {
        return LLILLJJLI;
    }

    static {
        CartBenefitBizType cartBenefitBizType = new CartBenefitBizType("UNKNOWN", 0, 0);
        UNKNOWN = cartBenefitBizType;
        CartBenefitBizType cartBenefitBizType2 = new CartBenefitBizType("CART_FREE_SHIPPING", 1, 1);
        CART_FREE_SHIPPING = cartBenefitBizType2;
        CartBenefitBizType cartBenefitBizType3 = new CartBenefitBizType("CART_SHIPPING_VOUCHER", 2, 2);
        CART_SHIPPING_VOUCHER = cartBenefitBizType3;
        CartBenefitBizType cartBenefitBizType4 = new CartBenefitBizType("UNPAID_ITEM", 3, 3);
        UNPAID_ITEM = cartBenefitBizType4;
        CartBenefitBizType cartBenefitBizType5 = new CartBenefitBizType("ITEM_PRICE_DROP", 4, 4);
        ITEM_PRICE_DROP = cartBenefitBizType5;
        CartBenefitBizType cartBenefitBizType6 = new CartBenefitBizType("ITEM_LOW_STOCK", 5, 5);
        ITEM_LOW_STOCK = cartBenefitBizType6;
        CartBenefitBizType cartBenefitBizType7 = new CartBenefitBizType("CART_SAVE_OFF", 6, 6);
        CART_SAVE_OFF = cartBenefitBizType7;
        CartBenefitBizType cartBenefitBizType8 = new CartBenefitBizType("CART_PROMOTION_DISCOUNT", 7, 7);
        CART_PROMOTION_DISCOUNT = cartBenefitBizType8;
        CartBenefitBizType cartBenefitBizType9 = new CartBenefitBizType("DIRECT_SUBSIDY", 8, 8);
        DIRECT_SUBSIDY = cartBenefitBizType9;
        CartBenefitBizType[] cartBenefitBizTypeArr = {cartBenefitBizType, cartBenefitBizType2, cartBenefitBizType3, cartBenefitBizType4, cartBenefitBizType5, cartBenefitBizType6, cartBenefitBizType7, cartBenefitBizType8, cartBenefitBizType9};
        LL = cartBenefitBizTypeArr;
        LLILLJJLI = new C2254308sP(cartBenefitBizTypeArr);
    }

    public static CartBenefitBizType[] values() {
        return (CartBenefitBizType[]) LL.clone();
    }

    public static CartBenefitBizType valueOf(String str) {
        return (CartBenefitBizType) C08FF.LIZ(CartBenefitBizType.class, str);
    }

    public CartBenefitBizType(String str, int i, int i2) {
    }
}
