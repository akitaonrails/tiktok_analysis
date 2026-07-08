package com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class AISuggestTopic {

    @C09CT("score")
    public final Double score;

    @C09CT("source")
    public final String source;

    @C09CT("suggest_id")
    public final String suggestId;

    @C09CT("title")
    public final String title;

    public AISuggestTopic() {
        this(null, null, null, null);
    }

    public AISuggestTopic(String str, String str2, String str3, Double d) {
        this.title = str;
        this.source = str2;
        this.suggestId = str3;
        this.score = d;
    }
}
