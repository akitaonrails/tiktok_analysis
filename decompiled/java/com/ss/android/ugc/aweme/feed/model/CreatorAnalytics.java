package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CreatorAnalytics implements Serializable {

    @C09CT("creator_analytics_data_status")
    public int creatorAnalyticsDataStatus;

    @C09CT("creator_analytics_entrance_status")
    public Integer creatorAnalyticsEntranceStatus = 0;

    @C09CT("item_analytics_data_status")
    public int itemAnalyticsDataStatus;

    @C09CT("show_analytics_data_entrance")
    public boolean showAnalyticsDataEntrance;

    public final int getCreatorAnalyticsDataStatus() {
        return this.creatorAnalyticsDataStatus;
    }

    public final Integer getCreatorAnalyticsEntranceStatus() {
        return this.creatorAnalyticsEntranceStatus;
    }

    public final int getItemAnalyticsDataStatus() {
        return this.itemAnalyticsDataStatus;
    }

    public final boolean getShowAnalyticsDataEntrance() {
        return this.showAnalyticsDataEntrance;
    }

    public final void setCreatorAnalyticsEntranceStatus(Integer num) {
        this.creatorAnalyticsEntranceStatus = num;
    }
}
