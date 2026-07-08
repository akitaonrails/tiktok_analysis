package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PropSalesTaskBase {

    @C09CT("end_time")
    public long endTime;

    @C09CT("min_fans_limit")
    public long minFansLimit;

    @C09CT("requirement")
    public GBLGameRichText requirement;

    @C09CT("sale_point")
    public PropSalesSellingPoint salePoint;

    @C09CT("show_revenue_share_percentage")
    public long showRevenueSharePercentage;

    @C09CT("start_time")
    public long startTime;

    @C09CT("task_status")
    public int taskStatus;

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("game_id")
    public String gameId = "";

    @C09CT("cps_price_list")
    public List<CpsPrice> cpsPriceList = new ArrayList();

    @C09CT("shop_url")
    public String shopUrl = "";

    @C09CT("header_image_url")
    public String headerImageUrl = "";

    @C09CT("header_image_color")
    public String headerImageColor = "";

    @C09CT("prop_supply_name")
    public String propSupplyName = "";
}
