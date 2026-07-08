package com.ss.android.ugc.aweme.repo;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuItemListResponse extends BaseResponse {

    @C09CT("danmaku_list")
    public List<DanmakuStruct> data;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("next_offset")
    public final long nextOffset;

    @C09CT("total_count")
    public final long totalCount;

    public final List<DanmakuStruct> getData() {
        return this.data;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getNextOffset() {
        return this.nextOffset;
    }

    public final long getTotalCount() {
        return this.totalCount;
    }

    public final void setData(List<DanmakuStruct> list) {
        this.data = list;
    }
}
