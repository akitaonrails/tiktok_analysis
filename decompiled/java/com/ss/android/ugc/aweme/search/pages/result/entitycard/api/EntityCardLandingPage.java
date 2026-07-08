package com.ss.android.ugc.aweme.search.pages.result.entitycard.api;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class EntityCardLandingPage {

    @C09CT("card_type")
    public final int cardType;

    @C09CT("doc_id")
    public final long docId;

    @C09CT("top1_multi_summary")
    public final Top1MultiSummary top1MultiSummary;

    public EntityCardLandingPage() {
        this(0, 0L, null);
    }

    public EntityCardLandingPage(int i, long j, Top1MultiSummary top1MultiSummary) {
        this.cardType = i;
        this.docId = j;
        this.top1MultiSummary = top1MultiSummary;
    }
}
