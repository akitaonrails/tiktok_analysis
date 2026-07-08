package com.ss.android.ugc.now.interaction.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class LikeListResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("cursor")
    public final long cursor;

    @C09CT("is_downgrade")
    public boolean isDowngrade;

    @C09CT("has_more")
    public final boolean isHasMore;

    @C09CT("like_list")
    public final List<User> likeList;

    @C09CT("log_pb")
    public LogPbBean logPd;

    @C09CT("offset")
    public final long offset;

    @C09CT("total_count")
    public long total;

    public final long getCursor() {
        return this.cursor;
    }

    public final List<User> getLikeList() {
        return this.likeList;
    }

    public final LogPbBean getLogPd() {
        return this.logPd;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getTotal() {
        return this.total;
    }

    public final boolean isDowngrade() {
        return this.isDowngrade;
    }

    public final boolean isHasMore() {
        return this.isHasMore;
    }

    public final void setDowngrade(boolean z) {
        this.isDowngrade = z;
    }

    public final void setLogPd(LogPbBean logPbBean) {
        this.logPd = logPbBean;
    }

    public final void setTotal(long j) {
        this.total = j;
    }
}
