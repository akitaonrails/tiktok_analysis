package com.ss.android.ugc.aweme.minis.model.payment;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class TradeOrderStatus {
    public static final /* synthetic */ TradeOrderStatus[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("3")
    public static final TradeOrderStatus MINIS_TRADE_ORDER_STATUS_CANCELLED;

    @C09CT("1")
    public static final TradeOrderStatus MINIS_TRADE_ORDER_STATUS_PENDING;

    @C09CT("2")
    public static final TradeOrderStatus MINIS_TRADE_ORDER_STATUS_SUCCESS;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final TradeOrderStatus NONE;

    public static InterfaceC2044707zh<TradeOrderStatus> getEntries() {
        return LLILLJJLI;
    }

    static {
        TradeOrderStatus tradeOrderStatus = new TradeOrderStatus("NONE", 0, 0);
        NONE = tradeOrderStatus;
        TradeOrderStatus tradeOrderStatus2 = new TradeOrderStatus("MINIS_TRADE_ORDER_STATUS_PENDING", 1, 1);
        MINIS_TRADE_ORDER_STATUS_PENDING = tradeOrderStatus2;
        TradeOrderStatus tradeOrderStatus3 = new TradeOrderStatus("MINIS_TRADE_ORDER_STATUS_SUCCESS", 2, 2);
        MINIS_TRADE_ORDER_STATUS_SUCCESS = tradeOrderStatus3;
        TradeOrderStatus tradeOrderStatus4 = new TradeOrderStatus("MINIS_TRADE_ORDER_STATUS_CANCELLED", 3, 3);
        MINIS_TRADE_ORDER_STATUS_CANCELLED = tradeOrderStatus4;
        TradeOrderStatus[] tradeOrderStatusArr = {tradeOrderStatus, tradeOrderStatus2, tradeOrderStatus3, tradeOrderStatus4};
        LL = tradeOrderStatusArr;
        LLILLJJLI = new C2254308sP(tradeOrderStatusArr);
    }

    public static TradeOrderStatus[] values() {
        return (TradeOrderStatus[]) LL.clone();
    }

    public static TradeOrderStatus valueOf(String str) {
        return (TradeOrderStatus) C08FF.LIZ(TradeOrderStatus.class, str);
    }

    public TradeOrderStatus(String str, int i, int i2) {
    }
}
