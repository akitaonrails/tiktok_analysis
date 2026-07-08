package com.ss.android.ugc.aweme.commercialize.model.commenttab;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class ReviewArea implements Serializable {

    @C09CT("number")
    public final int number;

    @C09CT("sort_list")
    public final List<SortItem> sortList;

    @C09CT("title")
    public final String title;

    public ReviewArea() {
        this("Reviews", 0, null);
    }

    public final int getNumber() {
        return this.number;
    }

    public final List<SortItem> getSortList() {
        return this.sortList;
    }

    public final String getTitle() {
        return this.title;
    }

    public ReviewArea(String str, int i, List<SortItem> list) {
        this.title = str;
        this.number = i;
        this.sortList = list;
    }
}
