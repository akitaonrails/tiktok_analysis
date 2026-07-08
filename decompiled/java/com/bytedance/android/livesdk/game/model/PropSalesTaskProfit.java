package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PropSalesTaskProfit {

    @C09CT("last_update_ts")
    public long lastUpdateTs;

    @C09CT("order_cnt")
    public long orderCnt;

    @C09CT("estimated_revenue")
    public String estimatedRevenue = "";

    @C09CT("gmv")
    public String gmv = "";

    @C09CT("refund")
    public String refund = "";

    @C09CT("actual_commission_turnover")
    public String actualCommissionTurnover = "";

    @C09CT("region_profit_list")
    public List<PropSalesItemProfit> regionProfitList = new ArrayList();
}
