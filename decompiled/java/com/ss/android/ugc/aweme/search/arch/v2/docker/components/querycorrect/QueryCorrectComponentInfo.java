package com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class QueryCorrectComponentInfo {

    @C09CT("correct_highlight_position")
    public final HighlightPosition correctHighlightPosition;

    @C09CT("correct_level")
    public final int correctLevel;

    @C09CT("corrected_query")
    public final String correctedQuery;

    @C09CT("original_query")
    public final String originalQuery;

    @C09CT("query_descs")
    public final List<QueryDesc> queryDescList;

    public QueryCorrectComponentInfo(List<QueryDesc> list, String str, String str2, HighlightPosition highlightPosition, int i) {
        this.queryDescList = list;
        this.correctedQuery = str;
        this.originalQuery = str2;
        this.correctHighlightPosition = highlightPosition;
        this.correctLevel = i;
    }
}
