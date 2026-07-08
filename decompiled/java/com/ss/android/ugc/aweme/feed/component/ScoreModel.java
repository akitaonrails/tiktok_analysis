package com.ss.android.ugc.aweme.feed.component;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ScoreModel {

    @C09CT("is_retry")
    public final boolean isRetry;

    @C09CT("reason")
    public final String reason;

    @C09CT("score_list")
    public final List<ScoredItem> scoreList;

    @C09CT("trace_id")
    public final String traceId;

    public ScoreModel() {
        this(null, null, false, null);
    }

    public ScoreModel(String str, String str2, boolean z, List<ScoredItem> list) {
        this.traceId = str;
        this.reason = str2;
        this.isRetry = z;
        this.scoreList = list;
    }
}
