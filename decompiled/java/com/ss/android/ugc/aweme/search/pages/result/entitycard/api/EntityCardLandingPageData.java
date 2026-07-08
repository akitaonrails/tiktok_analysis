package com.ss.android.ugc.aweme.search.pages.result.entitycard.api;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class EntityCardLandingPageData {

    @C09CT("page_detail")
    public final PageDetail pageDetail;

    @C09CT("page_type")
    public final int pageType;

    public EntityCardLandingPageData() {
        this(null, 0);
    }

    public EntityCardLandingPageData(PageDetail pageDetail, int i) {
        this.pageDetail = pageDetail;
        this.pageType = i;
    }
}
