package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C02RP;
import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class OrderType {
    public static final C02RP Companion;
    public static final /* synthetic */ OrderType[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("1024")
    public static final OrderType MEMBERSHIP;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final OrderType ORDER_TYPE_NORMAL;

    @C09CT("1")
    public static final OrderType ORDER_TYPE_PRE_RELEASE_ORDER;

    @C09CT("2")
    public static final OrderType SNS_ORDER;
    public final int LL;

    public static InterfaceC2044707zh<OrderType> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.02RP] */
    static {
        OrderType orderType = new OrderType("ORDER_TYPE_NORMAL", 0, 0);
        ORDER_TYPE_NORMAL = orderType;
        OrderType orderType2 = new OrderType("ORDER_TYPE_PRE_RELEASE_ORDER", 1, 1);
        ORDER_TYPE_PRE_RELEASE_ORDER = orderType2;
        OrderType orderType3 = new OrderType("SNS_ORDER", 2, 2);
        SNS_ORDER = orderType3;
        OrderType orderType4 = new OrderType("MEMBERSHIP", 3, 1024);
        MEMBERSHIP = orderType4;
        OrderType[] orderTypeArr = {orderType, orderType2, orderType3, orderType4};
        LLILLJJLI = orderTypeArr;
        LLILLL = new C2254308sP(orderTypeArr);
        Companion = new Object() { // from class: X.02RP
        };
    }

    public static OrderType[] values() {
        return (OrderType[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static OrderType valueOf(String str) {
        return (OrderType) C08FF.LIZ(OrderType.class, str);
    }

    public OrderType(String str, int i, int i2) {
        this.LL = i2;
    }
}
