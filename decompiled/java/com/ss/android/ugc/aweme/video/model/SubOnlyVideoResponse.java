package com.ss.android.ugc.aweme.video.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SubOnlyVideoResponse extends BaseResponse {

    @C09CT("aweme_list")
    public List<? extends Aweme> awemeList;

    @C09CT("creator_sov_status")
    public Integer creatorSovStatus;

    @C09CT("cursor_next")
    public String cursorNext;

    @C09CT("empty_state_subtitle")
    public String emptyStateSubtitle;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("max_time")
    public long maxTime;

    @C09CT("min_time")
    public long minTime;

    @C09CT("total")
    public int total;

    public SubOnlyVideoResponse() {
        this(0L, 0L, 0, 0, null, -1, "", "");
    }

    public SubOnlyVideoResponse(long j, long j2, int i, int i2, List<? extends Aweme> list, Integer num, String str, String str2) {
        this.minTime = j;
        this.maxTime = j2;
        this.hasMore = i;
        this.total = i2;
        this.awemeList = list;
        this.creatorSovStatus = num;
        this.emptyStateSubtitle = str;
        this.cursorNext = str2;
    }
}
