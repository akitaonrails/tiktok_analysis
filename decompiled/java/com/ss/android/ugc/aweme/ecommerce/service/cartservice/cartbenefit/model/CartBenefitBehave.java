package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes27.dex */
public final class CartBenefitBehave {

    @C09CT("2")
    public static final CartBenefitBehave BUBBLE_CLICK;

    @C09CT("1")
    public static final CartBenefitBehave BUBBLE_SHOW;
    public static final /* synthetic */ CartBenefitBehave[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("4")
    public static final CartBenefitBehave TAG_CLICK;

    @C09CT("3")
    public static final CartBenefitBehave TAG_SHOW;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final CartBenefitBehave UNKNOWN;

    public static InterfaceC2044707zh<CartBenefitBehave> getEntries() {
        return LLILLJJLI;
    }

    static {
        CartBenefitBehave cartBenefitBehave = new CartBenefitBehave("UNKNOWN", 0, 0);
        UNKNOWN = cartBenefitBehave;
        CartBenefitBehave cartBenefitBehave2 = new CartBenefitBehave("BUBBLE_SHOW", 1, 1);
        BUBBLE_SHOW = cartBenefitBehave2;
        CartBenefitBehave cartBenefitBehave3 = new CartBenefitBehave("BUBBLE_CLICK", 2, 2);
        BUBBLE_CLICK = cartBenefitBehave3;
        CartBenefitBehave cartBenefitBehave4 = new CartBenefitBehave("TAG_SHOW", 3, 3);
        TAG_SHOW = cartBenefitBehave4;
        CartBenefitBehave cartBenefitBehave5 = new CartBenefitBehave("TAG_CLICK", 4, 4);
        TAG_CLICK = cartBenefitBehave5;
        CartBenefitBehave[] cartBenefitBehaveArr = {cartBenefitBehave, cartBenefitBehave2, cartBenefitBehave3, cartBenefitBehave4, cartBenefitBehave5};
        LL = cartBenefitBehaveArr;
        LLILLJJLI = new C2254308sP(cartBenefitBehaveArr);
    }

    public static CartBenefitBehave[] values() {
        return (CartBenefitBehave[]) LL.clone();
    }

    public static CartBenefitBehave valueOf(String str) {
        return (CartBenefitBehave) C08FF.LIZ(CartBenefitBehave.class, str);
    }

    public CartBenefitBehave(String str, int i, int i2) {
    }
}
