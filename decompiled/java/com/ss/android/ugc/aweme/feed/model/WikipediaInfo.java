package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class WikipediaInfo implements Serializable {
    public String anchorId = "";
    public WikipediaExtra extra;

    @C09CT("keyword")
    public String keyword;

    @C09CT("lang")
    public String lang;

    public int hashCode() {
        String str = this.keyword;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final WikipediaExtra getExtra() {
        return this.extra;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLang() {
        return this.lang;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WikipediaInfo)) {
            return false;
        }
        WikipediaInfo wikipediaInfo = (WikipediaInfo) obj;
        if (Intrinsics.LJFF(wikipediaInfo.keyword, this.keyword) && Intrinsics.LJFF(wikipediaInfo.lang, this.lang)) {
            return true;
        }
        return false;
    }

    public final void setAnchorId(String str) {
        this.anchorId = str;
    }

    public final void setExtra(WikipediaExtra wikipediaExtra) {
        this.extra = wikipediaExtra;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLang(String str) {
        this.lang = str;
    }
}
