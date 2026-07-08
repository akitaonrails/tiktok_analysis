package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PublisherCreatorTaskJoinInfo {

    @C09CT("anchor_valid_view")
    public long anchorValidView;

    @C09CT("billing_indicator")
    public int billingIndicator;

    @C09CT("billing_threshold")
    public long billingThreshold;

    @C09CT("bonus_item_count")
    public long bonusItemCount;

    @C09CT("bonus_revenue")
    public long bonusRevenue;

    @C09CT("game_valid_install")
    public int gameValidInstall;

    @C09CT("last_updated_time")
    public long lastUpdatedTime;

    @C09CT("task_mode")
    public int taskMode;

    @C09CT("task_status")
    public int taskStatus;

    @C09CT("unit_price_increase_percent")
    public float unitPriceIncreasePercent;

    @C09CT("video_valid_view")
    public long videoValidView;

    @C09CT("estimated_revenue")
    public String estimatedRevenue = "";

    @C09CT("publisher_task_billing_layer_history_list")
    public List<PublisherTaskBillingLayerHistory> publisherTaskBillingLayerHistoryList = new ArrayList();

    @C09CT("pre_unit_price")
    public String preUnitPrice = "";
}
