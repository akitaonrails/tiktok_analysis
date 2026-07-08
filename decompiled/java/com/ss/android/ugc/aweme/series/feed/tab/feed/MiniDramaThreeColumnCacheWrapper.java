package com.ss.android.ugc.aweme.series.feed.tab.feed;

import X.C09CT;
import com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaThreeColumnCacheWrapper {

    @C09CT("resp")
    public final SeriesCenterListResponse resp;

    @C09CT("time_stamp")
    public final Long timeStamp;

    public MiniDramaThreeColumnCacheWrapper(Long l, SeriesCenterListResponse seriesCenterListResponse) {
        this.timeStamp = l;
        this.resp = seriesCenterListResponse;
    }
}
