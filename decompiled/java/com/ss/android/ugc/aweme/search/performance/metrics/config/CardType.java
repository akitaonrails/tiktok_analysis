package com.ss.android.ugc.aweme.search.performance.metrics.config;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class CardType {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("doc_type")
    public final Integer docType;

    @C09CT("origin_type")
    public final Integer originType;

    @C09CT("type")
    public final int type;

    public CardType() {
        this(0, null, null);
    }

    public CardType(int i, Integer num, Integer num2) {
        this.type = i;
        this.docType = num;
        this.originType = num2;
    }
}
