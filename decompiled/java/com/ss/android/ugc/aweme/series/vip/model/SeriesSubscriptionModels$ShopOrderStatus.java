package com.ss.android.ugc.aweme.series.vip.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes28.dex */
public final class SeriesSubscriptionModels$ShopOrderStatus {
    public static final /* synthetic */ SeriesSubscriptionModels$ShopOrderStatus[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("200")
    public static final SeriesSubscriptionModels$ShopOrderStatus SHOP_ORDER_STATUS_CANCELLED;

    @C09CT("100")
    public static final SeriesSubscriptionModels$ShopOrderStatus SHOP_ORDER_STATUS_DONE;

    @C09CT("10")
    public static final SeriesSubscriptionModels$ShopOrderStatus SHOP_ORDER_STATUS_INIT;

    @C09CT("20")
    public static final SeriesSubscriptionModels$ShopOrderStatus SHOP_ORDER_STATUS_PAY_SUCCESS;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final SeriesSubscriptionModels$ShopOrderStatus SHOP_ORDER_STATUS_UNKNOWN;

    public static InterfaceC2044707zh<SeriesSubscriptionModels$ShopOrderStatus> getEntries() {
        return LLILLJJLI;
    }

    static {
        SeriesSubscriptionModels$ShopOrderStatus seriesSubscriptionModels$ShopOrderStatus = new SeriesSubscriptionModels$ShopOrderStatus("SHOP_ORDER_STATUS_UNKNOWN", 0);
        SHOP_ORDER_STATUS_UNKNOWN = seriesSubscriptionModels$ShopOrderStatus;
        SeriesSubscriptionModels$ShopOrderStatus seriesSubscriptionModels$ShopOrderStatus2 = new SeriesSubscriptionModels$ShopOrderStatus("SHOP_ORDER_STATUS_INIT", 1);
        SHOP_ORDER_STATUS_INIT = seriesSubscriptionModels$ShopOrderStatus2;
        SeriesSubscriptionModels$ShopOrderStatus seriesSubscriptionModels$ShopOrderStatus3 = new SeriesSubscriptionModels$ShopOrderStatus("SHOP_ORDER_STATUS_PAY_SUCCESS", 2);
        SHOP_ORDER_STATUS_PAY_SUCCESS = seriesSubscriptionModels$ShopOrderStatus3;
        SeriesSubscriptionModels$ShopOrderStatus seriesSubscriptionModels$ShopOrderStatus4 = new SeriesSubscriptionModels$ShopOrderStatus("SHOP_ORDER_STATUS_DONE", 3);
        SHOP_ORDER_STATUS_DONE = seriesSubscriptionModels$ShopOrderStatus4;
        SeriesSubscriptionModels$ShopOrderStatus seriesSubscriptionModels$ShopOrderStatus5 = new SeriesSubscriptionModels$ShopOrderStatus("SHOP_ORDER_STATUS_CANCELLED", 4);
        SHOP_ORDER_STATUS_CANCELLED = seriesSubscriptionModels$ShopOrderStatus5;
        SeriesSubscriptionModels$ShopOrderStatus[] seriesSubscriptionModels$ShopOrderStatusArr = {seriesSubscriptionModels$ShopOrderStatus, seriesSubscriptionModels$ShopOrderStatus2, seriesSubscriptionModels$ShopOrderStatus3, seriesSubscriptionModels$ShopOrderStatus4, seriesSubscriptionModels$ShopOrderStatus5};
        LL = seriesSubscriptionModels$ShopOrderStatusArr;
        LLILLJJLI = new C2254308sP(seriesSubscriptionModels$ShopOrderStatusArr);
    }

    public static SeriesSubscriptionModels$ShopOrderStatus[] values() {
        return (SeriesSubscriptionModels$ShopOrderStatus[]) LL.clone();
    }

    public static SeriesSubscriptionModels$ShopOrderStatus valueOf(String str) {
        return (SeriesSubscriptionModels$ShopOrderStatus) C08FF.LIZ(SeriesSubscriptionModels$ShopOrderStatus.class, str);
    }

    public SeriesSubscriptionModels$ShopOrderStatus(String str, int i) {
    }
}
