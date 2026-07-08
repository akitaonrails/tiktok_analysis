package com.bytedance.android.livesdk.game.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class MonthlyProfit {

    @C09CT("earnings")
    public String earnings;

    @C09CT("month")
    public Integer month;

    @C09CT("new_installs")
    public long newInstalls;

    @C09CT("refunds")
    public String refunds;

    @C09CT("total_revenue")
    public String totalRevenue;

    @C09CT("year")
    public Integer year;

    @C09CT("refunds_usd")
    public String refundsUsd = "";

    @C09CT("total_revenue_usd")
    public String totalRevenueUsd = "";

    @C09CT("earnings_usd")
    public String earningsUsd = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.year != null) {
            sb.append(", year=");
            sb.append(this.year);
        }
        if (this.month != null) {
            sb.append(", month=");
            sb.append(this.month);
        }
        if (this.earnings != null) {
            sb.append(", revenue=");
            sb.append(this.earnings);
        }
        if (this.totalRevenue != null) {
            sb.append(", total_income=");
            sb.append(this.totalRevenue);
        }
        if (this.refunds != null) {
            sb.append(", refunds=");
            sb.append(this.refunds);
        }
        sb.replace(0, 2, "MonthlyProfit{");
        sb.append('}');
        return sb.toString();
    }
}
