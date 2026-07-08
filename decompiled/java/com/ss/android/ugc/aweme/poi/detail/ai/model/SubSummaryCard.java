package com.ss.android.ugc.aweme.poi.detail.ai.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class SubSummaryCard implements Serializable {

    @C09CT("cover")
    public final String cover;

    @C09CT("noted_text")
    public final String notedText;

    @C09CT("source")
    public final Source source;

    @C09CT("sub_summary_id")
    public final String subSummaryId;

    @C09CT("sub_summary_text")
    public final String subSummaryText;

    public SubSummaryCard() {
        this(null, null, null, null, null);
    }

    public SubSummaryCard(String str, String str2, Source source, String str3, String str4) {
        this.cover = str;
        this.notedText = str2;
        this.source = source;
        this.subSummaryId = str3;
        this.subSummaryText = str4;
    }
}
