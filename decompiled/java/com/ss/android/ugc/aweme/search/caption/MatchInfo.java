package com.ss.android.ugc.aweme.search.caption;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MatchInfo implements Serializable {

    @C09CT("begin")
    public int begin;

    @C09CT("end")
    public int end;

    @C09CT("link")
    public String link;

    @C09CT("query")
    public String query;

    public final int getBegin() {
        return this.begin;
    }

    public final int getEnd() {
        return this.end;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getQuery() {
        return this.query;
    }

    public final void setBegin(int i) {
        this.begin = i;
    }

    public final void setEnd(int i) {
        this.end = i;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setQuery(String str) {
        this.query = str;
    }
}
