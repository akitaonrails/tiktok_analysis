package com.ss.android.ugc.aweme.tracker;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PrfTrackerSettingsModel {

    @C09CT("block_list")
    public final List<String> blockList;

    @C09CT("enable_lcp_track")
    public final int enableLcpTrack;

    @C09CT("predicate_timeout_limit")
    public final int predicateTimeoutLimit;

    @C09CT("timeout")
    public final long timeout;

    @C09CT("wait_loop_limit")
    public final int waitLoopLimit;

    public PrfTrackerSettingsModel() {
        this(30000L, 5, 3, 0, C1697810uHb.LJIILJJIL("poi_head_info", "travel_head_info", "poi_footer", "not_region_poi_transparent_header", "region_poi_transparent_header"));
    }

    public PrfTrackerSettingsModel(long j, int i, int i2, int i3, List<String> list) {
        this.timeout = j;
        this.predicateTimeoutLimit = i;
        this.waitLoopLimit = i2;
        this.enableLcpTrack = i3;
        this.blockList = list;
    }
}
