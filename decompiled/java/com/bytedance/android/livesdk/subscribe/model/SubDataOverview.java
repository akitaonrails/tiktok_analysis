package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class SubDataOverview {

    @C09CT("active_subscribers_count")
    public SubDataItemView activeSubscribersCount;

    @C09CT("curr_day_order_count")
    public long currDayOrderCount;

    @C09CT("in_periodic_payout_region")
    public boolean inPeriodicPayoutRegion;

    @C09CT("prev_day_order_count")
    public long prevDayOrderCount;

    @C09CT("stats_display_text")
    public String statsDisplayText = "";

    @C09CT("total_subscription_income")
    public SubDataItemView totalSubscriptionIncome;
}
