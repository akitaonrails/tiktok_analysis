package com.ss.android.ugc.aweme.music.discovery.api;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class MusicChartVideosV1Response {

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("has_more")
    public final Integer hasMore;

    @C09CT("status_msg")
    public final String msg;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("videos")
    public final List<Aweme> videos;

    public MusicChartVideosV1Response() {
        this(null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicChartVideosV1Response(Integer num, String str, List<? extends Aweme> list, Integer num2, Integer num3) {
        this.statusCode = num;
        this.msg = str;
        this.videos = list;
        this.cursor = num2;
        this.hasMore = num3;
    }
}
