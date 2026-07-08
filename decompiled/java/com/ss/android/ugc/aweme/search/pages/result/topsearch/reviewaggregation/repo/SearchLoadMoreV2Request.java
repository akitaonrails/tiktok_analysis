package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLoadMoreV2Request {

    @C09CT("card_type")
    public final int cardType;

    @C09CT("count")
    public final int count;

    @C09CT("doc_id")
    public final String docId;

    @C09CT("is_paginated")
    public final int isPaginated;

    @C09CT("keyword")
    public final String keyword;

    @C09CT("offset")
    public final int offset;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("search_id")
    public final String searchId;

    @C09CT("unique_key")
    public final String uniqueKey;

    public SearchLoadMoreV2Request() {
        this("3", 0, 0, 0, 0, "", null, null, null);
    }

    public SearchLoadMoreV2Request(String str, int i, int i2, int i3, int i4, String str2, String str3, String str4, String str5) {
        this.scene = str;
        this.cardType = i;
        this.offset = i2;
        this.count = i3;
        this.isPaginated = i4;
        this.uniqueKey = str2;
        this.keyword = str3;
        this.searchId = str4;
        this.docId = str5;
    }
}
