package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LibraryCategory {
    public static final int $stable = 0;

    @C09CT("image")
    public final String image;

    @C09CT("query")
    public final String query;

    @C09CT("title")
    public final String title;

    public LibraryCategory() {
        this("", "", "");
    }

    public LibraryCategory(String str, String str2, String str3) {
        this.title = str;
        this.query = str2;
        this.image = str3;
    }
}
