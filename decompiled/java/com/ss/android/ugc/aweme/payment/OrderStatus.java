package com.ss.android.ugc.aweme.payment;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class OrderStatus {
    public static final /* synthetic */ OrderStatus[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("1")
    public static final OrderStatus PAID_CONTENT_ORDER_STATUS_COMPLETED;

    @C09CT("2")
    public static final OrderStatus PAID_CONTENT_ORDER_STATUS_OTHERS;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final OrderStatus PAID_CONTENT_ORDER_STATUS_PENDING;

    public static InterfaceC2044707zh<OrderStatus> getEntries() {
        return LLILLJJLI;
    }

    static {
        OrderStatus orderStatus = new OrderStatus("PAID_CONTENT_ORDER_STATUS_PENDING", 0);
        PAID_CONTENT_ORDER_STATUS_PENDING = orderStatus;
        OrderStatus orderStatus2 = new OrderStatus("PAID_CONTENT_ORDER_STATUS_COMPLETED", 1);
        PAID_CONTENT_ORDER_STATUS_COMPLETED = orderStatus2;
        OrderStatus orderStatus3 = new OrderStatus("PAID_CONTENT_ORDER_STATUS_OTHERS", 2);
        PAID_CONTENT_ORDER_STATUS_OTHERS = orderStatus3;
        OrderStatus[] orderStatusArr = {orderStatus, orderStatus2, orderStatus3};
        LL = orderStatusArr;
        LLILLJJLI = new C2254308sP(orderStatusArr);
    }

    public static OrderStatus[] values() {
        return (OrderStatus[]) LL.clone();
    }

    public static OrderStatus valueOf(String str) {
        return (OrderStatus) C08FF.LIZ(OrderStatus.class, str);
    }

    public OrderStatus(String str, int i) {
    }
}
