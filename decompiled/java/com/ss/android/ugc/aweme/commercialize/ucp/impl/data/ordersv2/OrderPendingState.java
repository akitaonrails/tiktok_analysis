package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class OrderPendingState implements Serializable {

    @C09CT("FAILED")
    public static final OrderPendingState FAILED;
    public static final /* synthetic */ OrderPendingState[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("SYNCING")
    public static final OrderPendingState SYNCING;

    public static InterfaceC2044707zh<OrderPendingState> getEntries() {
        return LLILLJJLI;
    }

    static {
        OrderPendingState orderPendingState = new OrderPendingState("SYNCING", 0);
        SYNCING = orderPendingState;
        OrderPendingState orderPendingState2 = new OrderPendingState("FAILED", 1);
        FAILED = orderPendingState2;
        OrderPendingState[] orderPendingStateArr = {orderPendingState, orderPendingState2};
        LL = orderPendingStateArr;
        LLILLJJLI = new C2254308sP(orderPendingStateArr);
    }

    public static OrderPendingState[] values() {
        return (OrderPendingState[]) LL.clone();
    }

    public static OrderPendingState valueOf(String str) {
        return (OrderPendingState) C08FF.LIZ(OrderPendingState.class, str);
    }

    public OrderPendingState(String str, int i) {
    }
}
