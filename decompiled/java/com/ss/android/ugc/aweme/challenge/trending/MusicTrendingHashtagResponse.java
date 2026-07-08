package com.ss.android.ugc.aweme.challenge.trending;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicTrendingHashtagResponse {

    @C09CT("hashtag_list")
    public final List<CreationHashtagModel> hashtagList;

    @C09CT("msg")
    public final String msg;

    @C09CT("status_code")
    public final Integer statusCode;

    public MusicTrendingHashtagResponse() {
        this(null, null, null);
    }

    public MusicTrendingHashtagResponse(Integer num, String str, List<CreationHashtagModel> list) {
        this.statusCode = num;
        this.msg = str;
        this.hashtagList = list;
    }
}
