package com.ss.android.ugc.aweme.detail.api;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvoteFeedStruct implements Serializable {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("upvote_list")
    public final UpvoteList upvoteList;

    @C09CT("viewed")
    public final boolean viewed;

    public UpvoteFeedStruct() {
        this(new Aweme(), new UpvoteList(null, 0L, false, 0L, null, null, 0L, null, null, null, null, 0L, 4095, null), false);
    }

    public UpvoteFeedStruct(Aweme aweme, UpvoteList upvoteList, boolean z) {
        this.aweme = aweme;
        this.upvoteList = upvoteList;
        this.viewed = z;
    }
}
