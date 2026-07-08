package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchHelpPostCardInfo {

    @C09CT("is_click_card")
    public final int isClicked;

    @C09CT("is_publish_help_post")
    public final int isPublished;

    @C09CT("timestamp")
    public final long showTimeStamp;

    public SearchHelpPostCardInfo() {
        this(0L, 0, 0);
    }

    public SearchHelpPostCardInfo(long j, int i, int i2) {
        this.showTimeStamp = j;
        this.isClicked = i;
        this.isPublished = i2;
    }

    public static SearchHelpPostCardInfo LIZ(SearchHelpPostCardInfo searchHelpPostCardInfo, long j, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j = searchHelpPostCardInfo.showTimeStamp;
        }
        if ((i3 & 2) != 0) {
            i = searchHelpPostCardInfo.isClicked;
        }
        if ((i3 & 4) != 0) {
            i2 = searchHelpPostCardInfo.isPublished;
        }
        return new SearchHelpPostCardInfo(j, i, i2);
    }
}
