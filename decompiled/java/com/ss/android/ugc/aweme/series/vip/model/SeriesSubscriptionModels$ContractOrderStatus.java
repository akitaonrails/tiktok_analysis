package com.ss.android.ugc.aweme.series.vip.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes28.dex */
public final class SeriesSubscriptionModels$ContractOrderStatus {

    @C09CT("20")
    public static final SeriesSubscriptionModels$ContractOrderStatus CONTRACT_ORDER_STATUS_ACTIVE;

    @C09CT("200")
    public static final SeriesSubscriptionModels$ContractOrderStatus CONTRACT_ORDER_STATUS_CANCELLED;

    @C09CT("30")
    public static final SeriesSubscriptionModels$ContractOrderStatus CONTRACT_ORDER_STATUS_CANCEL_RENEW;

    @C09CT("100")
    public static final SeriesSubscriptionModels$ContractOrderStatus CONTRACT_ORDER_STATUS_EXPIRED;

    @C09CT("10")
    public static final SeriesSubscriptionModels$ContractOrderStatus CONTRACT_ORDER_STATUS_INIT;

    @C09CT("40")
    public static final SeriesSubscriptionModels$ContractOrderStatus CONTRACT_ORDER_STATUS_RENEW_FAILED;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final SeriesSubscriptionModels$ContractOrderStatus CONTRACT_ORDER_STATUS_UNKNOWN;
    public static final /* synthetic */ SeriesSubscriptionModels$ContractOrderStatus[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<SeriesSubscriptionModels$ContractOrderStatus> getEntries() {
        return LLILLJJLI;
    }

    static {
        SeriesSubscriptionModels$ContractOrderStatus seriesSubscriptionModels$ContractOrderStatus = new SeriesSubscriptionModels$ContractOrderStatus("CONTRACT_ORDER_STATUS_UNKNOWN", 0);
        CONTRACT_ORDER_STATUS_UNKNOWN = seriesSubscriptionModels$ContractOrderStatus;
        SeriesSubscriptionModels$ContractOrderStatus seriesSubscriptionModels$ContractOrderStatus2 = new SeriesSubscriptionModels$ContractOrderStatus("CONTRACT_ORDER_STATUS_INIT", 1);
        CONTRACT_ORDER_STATUS_INIT = seriesSubscriptionModels$ContractOrderStatus2;
        SeriesSubscriptionModels$ContractOrderStatus seriesSubscriptionModels$ContractOrderStatus3 = new SeriesSubscriptionModels$ContractOrderStatus("CONTRACT_ORDER_STATUS_ACTIVE", 2);
        CONTRACT_ORDER_STATUS_ACTIVE = seriesSubscriptionModels$ContractOrderStatus3;
        SeriesSubscriptionModels$ContractOrderStatus seriesSubscriptionModels$ContractOrderStatus4 = new SeriesSubscriptionModels$ContractOrderStatus("CONTRACT_ORDER_STATUS_CANCEL_RENEW", 3);
        CONTRACT_ORDER_STATUS_CANCEL_RENEW = seriesSubscriptionModels$ContractOrderStatus4;
        SeriesSubscriptionModels$ContractOrderStatus seriesSubscriptionModels$ContractOrderStatus5 = new SeriesSubscriptionModels$ContractOrderStatus("CONTRACT_ORDER_STATUS_RENEW_FAILED", 4);
        CONTRACT_ORDER_STATUS_RENEW_FAILED = seriesSubscriptionModels$ContractOrderStatus5;
        SeriesSubscriptionModels$ContractOrderStatus seriesSubscriptionModels$ContractOrderStatus6 = new SeriesSubscriptionModels$ContractOrderStatus("CONTRACT_ORDER_STATUS_EXPIRED", 5);
        CONTRACT_ORDER_STATUS_EXPIRED = seriesSubscriptionModels$ContractOrderStatus6;
        SeriesSubscriptionModels$ContractOrderStatus seriesSubscriptionModels$ContractOrderStatus7 = new SeriesSubscriptionModels$ContractOrderStatus("CONTRACT_ORDER_STATUS_CANCELLED", 6);
        CONTRACT_ORDER_STATUS_CANCELLED = seriesSubscriptionModels$ContractOrderStatus7;
        SeriesSubscriptionModels$ContractOrderStatus[] seriesSubscriptionModels$ContractOrderStatusArr = {seriesSubscriptionModels$ContractOrderStatus, seriesSubscriptionModels$ContractOrderStatus2, seriesSubscriptionModels$ContractOrderStatus3, seriesSubscriptionModels$ContractOrderStatus4, seriesSubscriptionModels$ContractOrderStatus5, seriesSubscriptionModels$ContractOrderStatus6, seriesSubscriptionModels$ContractOrderStatus7};
        LL = seriesSubscriptionModels$ContractOrderStatusArr;
        LLILLJJLI = new C2254308sP(seriesSubscriptionModels$ContractOrderStatusArr);
    }

    public static SeriesSubscriptionModels$ContractOrderStatus[] values() {
        return (SeriesSubscriptionModels$ContractOrderStatus[]) LL.clone();
    }

    public static SeriesSubscriptionModels$ContractOrderStatus valueOf(String str) {
        return (SeriesSubscriptionModels$ContractOrderStatus) C08FF.LIZ(SeriesSubscriptionModels$ContractOrderStatus.class, str);
    }

    public SeriesSubscriptionModels$ContractOrderStatus(String str, int i) {
    }
}
