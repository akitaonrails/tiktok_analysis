package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BigThumb implements Serializable {

    @C09CT("duration")
    public double duration;
    public String fext;

    @C09CT("img_num")
    public long imgNum;

    @C09CT("img_uris")
    public List<String> imgUris;

    @C09CT("img_url")
    public String imgUrl;

    @C09CT("img_urls")
    public List<String> imgUrls;

    @C09CT("img_x_len")
    public long imgXLen;

    @C09CT("img_x_size")
    public long imgXSize;

    @C09CT("img_y_len")
    public long imgYLen;

    @C09CT("img_y_size")
    public long imgYSize;
    public double interval;
    public String uri;

    public BigThumb() {
    }

    public BigThumb(long j, String str, String str2, long j2, long j3, long j4, long j5, double d, double d2, String str3, List<String> list, List<String> list2) {
        this.imgNum = j;
        this.uri = str;
        this.imgUrl = str2;
        this.imgXSize = j2;
        this.imgYSize = j3;
        this.imgXLen = j4;
        this.imgYLen = j5;
        this.duration = d;
        this.interval = d2;
        this.fext = str3;
        this.imgUris = list;
        this.imgUrls = list2;
    }
}
