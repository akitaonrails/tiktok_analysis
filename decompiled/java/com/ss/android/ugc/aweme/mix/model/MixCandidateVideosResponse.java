package com.ss.android.ugc.aweme.mix.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class MixCandidateVideosResponse extends BaseResponse implements Serializable {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("max_cursor")
    public long maxCursor;

    @C09CT("min_cursor")
    public long minCursor;

    @C09CT("aweme_list")
    public List<? extends Aweme> mixVideos;

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final long getMinCursor() {
        return this.minCursor;
    }

    public final List<Aweme> getMixVideos() {
        return this.mixVideos;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public final void setMinCursor(long j) {
        this.minCursor = j;
    }

    public final void setMixVideos(List<? extends Aweme> list) {
        this.mixVideos = list;
    }
}
