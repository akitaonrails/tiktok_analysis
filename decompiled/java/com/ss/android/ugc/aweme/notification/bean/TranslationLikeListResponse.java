package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class TranslationLikeListResponse extends BaseResponse {
    public transient int LL;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("max_cursor")
    public long maxCursor;

    @C09CT("next_offset")
    public long nextOffset;

    @C09CT("total")
    public int total;

    @C09CT("users")
    public List<User> users;
}
