package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchItemStruct {

    @C09CT("aweme_info")
    public final Aweme aweme;

    @C09CT("comment_list")
    public final List<Comment> commentData;

    @C09CT("related_search")
    public final RelatedSearch relatedSearch;

    @C09CT("search_aweme_info")
    public final SearchAwemeInfo searchAwemeInfo;

    public SearchItemStruct() {
        this(null, new ArrayList(), null, null);
    }

    public SearchItemStruct(Aweme aweme, List<Comment> list, SearchAwemeInfo searchAwemeInfo, RelatedSearch relatedSearch) {
        this.aweme = aweme;
        this.commentData = list;
        this.searchAwemeInfo = searchAwemeInfo;
        this.relatedSearch = relatedSearch;
    }
}
