package com.ss.android.ugc.aweme.story.highlights.dm;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes15.dex */
public final class HighlightCollectionQueryResult {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("collection_id")
    public final String collectionId;

    public HighlightCollectionQueryResult(String str, String str2, Aweme aweme) {
        this.collectionId = str;
        this.awemeId = str2;
        this.aweme = aweme;
    }
}
