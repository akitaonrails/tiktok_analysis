package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class MentionQueryPagination implements Serializable {

    @C09CT("custom_sorted")
    public final MentionQueryPaginationParam customSorted;

    @C09CT("following")
    public final MentionQueryPaginationParam following;

    @C09CT("friend")
    public final MentionQueryPaginationParam friend;

    @C09CT("mentioned")
    public final MentionQueryPaginationParam mentioned;

    @C09CT("recent")
    public final MentionQueryPaginationParam recent;

    public MentionQueryPagination() {
        this(new MentionQueryPaginationParam(true, 0L), new MentionQueryPaginationParam(true, 0L), new MentionQueryPaginationParam(true, 0L), new MentionQueryPaginationParam(true, 0L), new MentionQueryPaginationParam(true, 0L));
    }

    public MentionQueryPagination(MentionQueryPaginationParam mentionQueryPaginationParam, MentionQueryPaginationParam mentionQueryPaginationParam2, MentionQueryPaginationParam mentionQueryPaginationParam3, MentionQueryPaginationParam mentionQueryPaginationParam4, MentionQueryPaginationParam mentionQueryPaginationParam5) {
        this.recent = mentionQueryPaginationParam;
        this.friend = mentionQueryPaginationParam2;
        this.following = mentionQueryPaginationParam3;
        this.mentioned = mentionQueryPaginationParam4;
        this.customSorted = mentionQueryPaginationParam5;
    }
}
