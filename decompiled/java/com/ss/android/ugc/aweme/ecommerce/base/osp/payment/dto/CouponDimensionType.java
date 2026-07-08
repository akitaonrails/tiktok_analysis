package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.C845803Se;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class CouponDimensionType {

    @C09CT("2")
    public static final CouponDimensionType COUPON_DIMENSION_TYPE_BANK_CODE;

    @C09CT("1")
    public static final CouponDimensionType COUPON_DIMENSION_TYPE_CARD_BIN;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final CouponDimensionType COUPON_DIMENSION_TYPE_PAYMENT_METHOD;
    public static final C845803Se Companion;
    public static final /* synthetic */ CouponDimensionType[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<CouponDimensionType> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.03Se] */
    static {
        CouponDimensionType couponDimensionType = new CouponDimensionType("COUPON_DIMENSION_TYPE_PAYMENT_METHOD", 0, 0);
        COUPON_DIMENSION_TYPE_PAYMENT_METHOD = couponDimensionType;
        CouponDimensionType couponDimensionType2 = new CouponDimensionType("COUPON_DIMENSION_TYPE_CARD_BIN", 1, 1);
        COUPON_DIMENSION_TYPE_CARD_BIN = couponDimensionType2;
        CouponDimensionType couponDimensionType3 = new CouponDimensionType("COUPON_DIMENSION_TYPE_BANK_CODE", 2, 2);
        COUPON_DIMENSION_TYPE_BANK_CODE = couponDimensionType3;
        CouponDimensionType[] couponDimensionTypeArr = {couponDimensionType, couponDimensionType2, couponDimensionType3};
        LLILLJJLI = couponDimensionTypeArr;
        LLILLL = new C2254308sP(couponDimensionTypeArr);
        Companion = new Object() { // from class: X.03Se
        };
    }

    public static CouponDimensionType[] values() {
        return (CouponDimensionType[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static CouponDimensionType valueOf(String str) {
        return (CouponDimensionType) C08FF.LIZ(CouponDimensionType.class, str);
    }

    public CouponDimensionType(String str, int i, int i2) {
        this.LL = i2;
    }
}
