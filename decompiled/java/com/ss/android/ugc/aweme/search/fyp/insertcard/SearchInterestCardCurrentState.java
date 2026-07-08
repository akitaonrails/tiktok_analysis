package com.ss.android.ugc.aweme.search.fyp.insertcard;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class SearchInterestCardCurrentState {

    @C09CT("client_disable_interval")
    public final Integer clientDisableInterval;

    @C09CT("current_time_millis")
    public final Long currentTimeMillis;

    @C09CT("dislike_times")
    public final Integer dislikeTimes;

    @C09CT("feed_count")
    public final Integer feedCount;

    @C09CT("last_show_time_millis")
    public final Long lastShowTimeMillis;

    @C09CT("shown_count")
    public final Integer shownCount;

    @C09CT("shown_flow_index")
    public final Integer shownFlowIndex;

    @C09CT("shown_time_millis")
    public final Long shownTimeMillis;

    @C09CT("skip_times")
    public final Integer skipTimes;

    public SearchInterestCardCurrentState(Integer num, Integer num2, Integer num3, Integer num4, Long l, Long l2, Integer num5, Long l3, Integer num6) {
        this.feedCount = num;
        this.shownFlowIndex = num2;
        this.skipTimes = num3;
        this.dislikeTimes = num4;
        this.currentTimeMillis = l;
        this.lastShowTimeMillis = l2;
        this.clientDisableInterval = num5;
        this.shownTimeMillis = l3;
        this.shownCount = num6;
    }
}
