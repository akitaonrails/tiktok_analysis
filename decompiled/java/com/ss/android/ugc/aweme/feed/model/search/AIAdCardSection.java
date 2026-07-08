package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AIAdCardSection implements Serializable {

    @C09CT("aweme_index")
    public final Integer awemeIndex;

    @C09CT("data")
    public final AIAdCardSectionData data;

    @C09CT("layout_type")
    public final int layoutType;

    public AIAdCardSection() {
        this(0, null, null);
    }

    public final Integer getAwemeIndex() {
        return this.awemeIndex;
    }

    public final AIAdCardSectionData getData() {
        return this.data;
    }

    public final int getLayoutType() {
        return this.layoutType;
    }

    public AIAdCardSection(int i, AIAdCardSectionData aIAdCardSectionData, Integer num) {
        this.layoutType = i;
        this.data = aIAdCardSectionData;
        this.awemeIndex = num;
    }
}
