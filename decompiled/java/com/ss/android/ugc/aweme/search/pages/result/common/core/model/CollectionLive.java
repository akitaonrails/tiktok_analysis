package com.ss.android.ugc.aweme.search.pages.result.common.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class CollectionLive implements Serializable {
    public static final int $stable = 8;

    @C09CT("title")
    public final String cardTitle;

    @C09CT("title_type")
    public final String cardTitleType;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("doc_id")
    public final Long docId;

    @C09CT("is_more")
    public final Boolean isMore;

    @C09CT("lives")
    public final List<Aweme> lives;

    public CollectionLive() {
        this(null, 0L, Boolean.TRUE, null, null, null);
    }

    public final Boolean isMore() {
        return this.isMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionLive(List<? extends Aweme> list, Long l, Boolean bool, Long l2, String str, String str2) {
        this.lives = list;
        this.docId = l;
        this.isMore = bool;
        this.cursor = l2;
        this.cardTitle = str;
        this.cardTitleType = str2;
    }
}
