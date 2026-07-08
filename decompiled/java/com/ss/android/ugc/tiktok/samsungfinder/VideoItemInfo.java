package com.ss.android.ugc.tiktok.samsungfinder;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class VideoItemInfo implements Serializable {

    @C09CT("caption")
    public final String caption;

    @C09CT("cover_image_url")
    public final String coverImage;

    @C09CT("digg_count")
    public final Integer diggCount;

    @C09CT("play_count")
    public final Integer viewCount;

    public VideoItemInfo(String str, String str2, Integer num, Integer num2) {
        this.caption = str;
        this.coverImage = str2;
        this.diggCount = num;
        this.viewCount = num2;
    }
}
