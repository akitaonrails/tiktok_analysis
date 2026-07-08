package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class Search {

    @C09CT("display_keyword")
    public String displayKeyword;

    @C09CT("keyword")
    public String keyword;

    public Search() {
        this("", "");
    }

    public final void setDisplayKeyword(String str) {
        this.displayKeyword = str;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public Search(String str, String str2) {
        this.keyword = str;
        this.displayKeyword = str2;
    }
}
