package com.ss.android.ugc.aweme.tools.music.music.collect.video;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class CollectVideoResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("cursor")
    public final Integer nextCursor;

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Integer getNextCursor() {
        return this.nextCursor;
    }
}
