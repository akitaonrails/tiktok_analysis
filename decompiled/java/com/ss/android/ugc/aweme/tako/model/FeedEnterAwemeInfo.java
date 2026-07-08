package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class FeedEnterAwemeInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("aweme_type")
    public final String awemeType;

    @C09CT("video_cover_uri")
    public final String videoCoverUri;

    @C09CT("video_cover_url_list")
    public final List<String> videoCoverUrlList;

    public FeedEnterAwemeInfo(String str, String str2, String str3, List<String> list) {
        this.awemeId = str;
        this.awemeType = str2;
        this.videoCoverUri = str3;
        this.videoCoverUrlList = list;
    }
}
