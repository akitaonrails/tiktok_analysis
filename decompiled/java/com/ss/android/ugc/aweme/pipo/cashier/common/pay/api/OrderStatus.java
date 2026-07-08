package com.ss.android.ugc.aweme.pipo.cashier.common.pay.api;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes27.dex */
public final class OrderStatus {

    @C09CT("closed")
    public static final OrderStatus CLOSED;

    @C09CT("expired")
    public static final OrderStatus EXPIRED;

    @C09CT("failed")
    public static final OrderStatus FAILED;

    @C09CT("init")
    public static final OrderStatus INIT;
    public static final /* synthetic */ OrderStatus[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("success")
    public static final OrderStatus SUCCESS;

    @C09CT("unknow")
    public static final OrderStatus UNKNOW;

    public static InterfaceC2044707zh<OrderStatus> getEntries() {
        return LLILLJJLI;
    }

    static {
        OrderStatus orderStatus = new OrderStatus("CLOSED", 0);
        CLOSED = orderStatus;
        OrderStatus orderStatus2 = new OrderStatus("EXPIRED", 1);
        EXPIRED = orderStatus2;
        OrderStatus orderStatus3 = new OrderStatus("INIT", 2);
        INIT = orderStatus3;
        OrderStatus orderStatus4 = new OrderStatus("SUCCESS", 3);
        SUCCESS = orderStatus4;
        OrderStatus orderStatus5 = new OrderStatus("FAILED", 4);
        FAILED = orderStatus5;
        OrderStatus orderStatus6 = new OrderStatus("UNKNOW", 5);
        UNKNOW = orderStatus6;
        OrderStatus[] orderStatusArr = {orderStatus, orderStatus2, orderStatus3, orderStatus4, orderStatus5, orderStatus6};
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
