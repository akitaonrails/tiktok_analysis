package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class RecommendWordMob implements Serializable {

    @C09CT("info")
    public String info;

    @C09CT("query_id")
    public String queryId;

    @C09CT("words_source")
    public String wordsSource;

    public final String getInfo() {
        return this.info;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public final String getWordsSource() {
        return this.wordsSource;
    }

    public final void setInfo(String str) {
        this.info = str;
    }

    public final void setQueryId(String str) {
        this.queryId = str;
    }

    public final void setWordsSource(String str) {
        this.wordsSource = str;
    }
}
