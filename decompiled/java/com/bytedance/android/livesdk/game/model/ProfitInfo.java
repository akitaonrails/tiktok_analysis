package com.bytedance.android.livesdk.game.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class ProfitInfo {

    @C09CT("daily_new_installs")
    public Long dailyNewInstalls;

    @C09CT("daily_new_players")
    public Long dailyNewPlayers;

    @C09CT("daily_revenue")
    public String dailyRevenue;

    @C09CT("end_ts")
    public Long endTs;

    @C09CT("start_ts")
    public Long startTs;

    @C09CT("total_earnings")
    public String totalEarnings;

    @C09CT("total_new_installs")
    public long totalNewInstalls;

    @C09CT("total_revenue")
    public String totalRevenue;

    @C09CT("daily_refunds_usd")
    public String dailyRefundsUsd = "";

    @C09CT("daily_earnings_usd")
    public String dailyEarningsUsd = "";

    @C09CT("total_earnings_usd")
    public String totalEarningsUsd = "";

    @C09CT("refunds_usd")
    public String refundsUsd = "";

    @C09CT("daily_revenue_usd")
    public String dailyRevenueUsd = "";

    @C09CT("total_revenue_usd")
    public String totalRevenueUsd = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.startTs != null) {
            sb.append(", start_ts=");
            sb.append(this.startTs);
        }
        if (this.endTs != null) {
            sb.append(", end_ts=");
            sb.append(this.endTs);
        }
        if (this.totalRevenue != null) {
            sb.append(", total_income=");
            sb.append(this.totalRevenue);
        }
        if (this.dailyRevenue != null) {
            sb.append(", daily_income=");
            sb.append(this.dailyRevenue);
        }
        if (this.dailyNewPlayers != null) {
            sb.append(", daily_new_players=");
            sb.append(this.dailyNewPlayers);
        }
        if (this.dailyNewInstalls != null) {
            sb.append(", daily_new_installs=");
            sb.append(this.dailyNewInstalls);
        }
        sb.replace(0, 2, "ProfitInfo{");
        sb.append('}');
        return sb.toString();
    }
}
