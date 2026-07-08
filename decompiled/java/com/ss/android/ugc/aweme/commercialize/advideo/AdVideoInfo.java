package com.ss.android.ugc.aweme.commercialize.advideo;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class AdVideoInfo implements Serializable {

    @C09CT("create_time")
    public final long createTime;

    @C09CT("desc")
    public final String desc;

    @C09CT("duration")
    public final Long duration;

    @C09CT("height")
    public final Integer height;

    @C09CT("play_url")
    public final String playUrl;

    @C09CT("poster_url")
    public final String poster_url;

    @C09CT("width")
    public final Integer width;

    public AdVideoInfo(String str, String str2, Long l, String str3, Integer num, Integer num2, long j) {
        this.desc = str;
        this.playUrl = str2;
        this.duration = l;
        this.poster_url = str3;
        this.height = num;
        this.width = num2;
        this.createTime = j;
    }
}
