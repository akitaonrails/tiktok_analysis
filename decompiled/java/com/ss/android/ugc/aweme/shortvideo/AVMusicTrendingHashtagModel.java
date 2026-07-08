package com.ss.android.ugc.aweme.shortvideo;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class AVMusicTrendingHashtagModel {

    @C09CT("hashtag_id")
    public final String hashtagId;

    @C09CT("is_hot_hashtag")
    public final Boolean isHotHashtag;

    @C09CT("post")
    public final Long post;

    @C09CT("title")
    public final String title;

    public AVMusicTrendingHashtagModel() {
        this(null, null, null, null);
    }

    public AVMusicTrendingHashtagModel(String str, String str2, Long l, Boolean bool) {
        this.hashtagId = str;
        this.title = str2;
        this.post = l;
        this.isHotHashtag = bool;
    }
}
