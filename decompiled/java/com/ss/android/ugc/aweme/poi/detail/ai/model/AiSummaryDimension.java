package com.ss.android.ugc.aweme.poi.detail.ai.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AiSummaryDimension implements Serializable {

    @C09CT("dimension_key")
    public final String dimensionKey;

    @C09CT("key_summary_short")
    public final String keySummaryShort;

    @C09CT("sub_summary_cards")
    public final List<SubSummaryCard> subSummaryCards;

    @C09CT("title")
    public final String title;

    public AiSummaryDimension() {
        this(null, null, null, null);
    }

    public AiSummaryDimension(String str, String str2, List<SubSummaryCard> list, String str3) {
        this.dimensionKey = str;
        this.keySummaryShort = str2;
        this.subSummaryCards = list;
        this.title = str3;
    }
}
