package com.ss.android.ugc.profile.business.profile.tab.search;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FavoriteSearchData extends BaseResponse {

    @C09CT("aweme_list")
    public List<? extends Aweme> awemeList;

    @C09CT("cursor")
    public Long cursor;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("hint_info")
    public FavoriteSearchHintInfo hintInfo;
}
