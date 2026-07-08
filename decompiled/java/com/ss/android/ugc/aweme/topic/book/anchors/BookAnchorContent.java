package com.ss.android.ugc.aweme.topic.book.anchors;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BookAnchorContent {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("author_name")
    public final String bookAuthor;

    @C09CT("book_cover_uri")
    public final String bookCoverUri;

    @C09CT("third_id")
    public final String bookId;

    @C09CT("title")
    public final String bookName;

    @C09CT("category")
    public final String category;

    @C09CT("topic_rating")
    public final Float rating;

    public BookAnchorContent(String str, String str2, String str3, String str4, String str5, Float f) {
        this.bookId = str;
        this.bookName = str2;
        this.bookCoverUri = str3;
        this.bookAuthor = str4;
        this.category = str5;
        this.rating = f;
    }
}
