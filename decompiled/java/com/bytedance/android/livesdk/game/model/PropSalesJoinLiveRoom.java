package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PropSalesJoinLiveRoom {

    @C09CT("prop_sales_task_profit")
    public PropSalesTaskProfit propSalesTaskProfit;

    @C09CT("room_audit_status")
    public int roomAuditStatus;

    @C09CT("start_time")
    public long startTime;

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("room_title")
    public String roomTitle = "";

    @C09CT("cover_image_url")
    public String coverImageUrl = "";

    @C09CT("region_profit_list")
    public List<PropSalesItemProfit> regionProfitList = new ArrayList();
}
