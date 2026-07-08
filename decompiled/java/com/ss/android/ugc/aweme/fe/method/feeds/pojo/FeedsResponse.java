package com.ss.android.ugc.aweme.fe.method.feeds.pojo;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedsResponse extends BaseResponse {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("is_new_user")
    public boolean isNewUser;

    @C09CT("aweme_list")
    public List<Aweme> list = new ArrayList();
}
