package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class ExtraRequestInfo {

    @C09CT("search_card_summary")
    public final String searchCardSummary;

    @C09CT("smart_search_card_answer")
    public final String smartSearchCardAnswer;

    @C09CT("smart_search_card_query")
    public final String smartSearchCardQuery;

    public ExtraRequestInfo() {
        this(null, null, null);
    }

    public ExtraRequestInfo(String str, String str2, String str3) {
        this.searchCardSummary = str;
        this.smartSearchCardQuery = str2;
        this.smartSearchCardAnswer = str3;
    }
}
