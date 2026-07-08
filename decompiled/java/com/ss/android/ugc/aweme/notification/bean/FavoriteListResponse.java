package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class FavoriteListResponse extends BaseResponse {
    public transient int LL;

    @C09CT("cursor")
    public long cursor;

    @C09CT("fav_info")
    public List<DiggInfo> diggInfos;

    @C09CT("has_more")
    public int hasMore;
}
