package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class HashtagInfo {

    @C09CT("hashtag_id")
    public final Long hashtagId;

    @C09CT("hashtag_img")
    public final String hashtagImg;

    @C09CT("hashtag_name")
    public final String hashtagName;

    public HashtagInfo(String str, Long l, String str2) {
        this.hashtagImg = str;
        this.hashtagId = l;
        this.hashtagName = str2;
    }
}
