package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class LikeListResponse extends BaseResponse {
    public transient int LL;

    @C09CT("digg_infos")
    public List<DiggInfo> diggInfos;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("max_cursor")
    public long maxCursor;

    @C09CT("min_cursor")
    public long minCursor;

    @C09CT("total")
    public int total;
}
