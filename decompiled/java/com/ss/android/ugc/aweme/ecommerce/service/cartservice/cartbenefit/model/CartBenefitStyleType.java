package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes27.dex */
public final class CartBenefitStyleType {

    @C09CT("3")
    public static final CartBenefitStyleType BUBBLE;

    @C09CT("2")
    public static final CartBenefitStyleType DYNAMIC_TAG;
    public static final /* synthetic */ CartBenefitStyleType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("4")
    public static final CartBenefitStyleType SIDE_SLIP;

    @C09CT("1")
    public static final CartBenefitStyleType TAG;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final CartBenefitStyleType UNDEFINE;

    public static InterfaceC2044707zh<CartBenefitStyleType> getEntries() {
        return LLILLJJLI;
    }

    static {
        CartBenefitStyleType cartBenefitStyleType = new CartBenefitStyleType("UNDEFINE", 0, 0);
        UNDEFINE = cartBenefitStyleType;
        CartBenefitStyleType cartBenefitStyleType2 = new CartBenefitStyleType("TAG", 1, 1);
        TAG = cartBenefitStyleType2;
        CartBenefitStyleType cartBenefitStyleType3 = new CartBenefitStyleType("DYNAMIC_TAG", 2, 2);
        DYNAMIC_TAG = cartBenefitStyleType3;
        CartBenefitStyleType cartBenefitStyleType4 = new CartBenefitStyleType("BUBBLE", 3, 3);
        BUBBLE = cartBenefitStyleType4;
        CartBenefitStyleType cartBenefitStyleType5 = new CartBenefitStyleType("SIDE_SLIP", 4, 4);
        SIDE_SLIP = cartBenefitStyleType5;
        CartBenefitStyleType[] cartBenefitStyleTypeArr = {cartBenefitStyleType, cartBenefitStyleType2, cartBenefitStyleType3, cartBenefitStyleType4, cartBenefitStyleType5};
        LL = cartBenefitStyleTypeArr;
        LLILLJJLI = new C2254308sP(cartBenefitStyleTypeArr);
    }

    public static CartBenefitStyleType[] values() {
        return (CartBenefitStyleType[]) LL.clone();
    }

    public static CartBenefitStyleType valueOf(String str) {
        return (CartBenefitStyleType) C08FF.LIZ(CartBenefitStyleType.class, str);
    }

    public CartBenefitStyleType(String str, int i, int i2) {
    }
}
