package com.ss.android.ugc.aweme.plugin.not_interested;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class NotInterestedTutorialData {

    @C09CT("add_favorite_text")
    public final String addFavoriteText;

    @C09CT("button")
    public final String button;

    @C09CT("not_interested_text")
    public final String notInterestedText;

    @C09CT("skip_video_count")
    public final Integer skipVideoCount;

    @C09CT("style")
    public final int style;

    @C09CT("title")
    public final String title;

    public NotInterestedTutorialData() {
        this(Integer.MAX_VALUE, null, null, null, null, -1);
    }

    public NotInterestedTutorialData(Integer num, String str, String str2, String str3, String str4, int i) {
        this.skipVideoCount = num;
        this.title = str;
        this.button = str2;
        this.notInterestedText = str3;
        this.addFavoriteText = str4;
        this.style = i;
    }
}
