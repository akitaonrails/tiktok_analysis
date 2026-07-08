package com.ss.android.ugc.aweme.cubes.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class VideoItemInfo implements Serializable {

    @C09CT("author_avatar_image")
    public final ImageItem authorAvatar;

    @C09CT("author_nick_name")
    public final String authorNickname;

    @C09CT("caption")
    public final String caption;

    @C09CT("cover_image")
    public final ImageItem coverImage;

    @C09CT("digg_count")
    public final Integer diggCount;

    @C09CT("duration")
    public final Long duration;

    @C09CT("play_count")
    public final Integer playCount;

    public VideoItemInfo(ImageItem imageItem, String str, String str2, ImageItem imageItem2, Integer num, Integer num2, Long l) {
        this.authorAvatar = imageItem;
        this.authorNickname = str;
        this.caption = str2;
        this.coverImage = imageItem2;
        this.diggCount = num;
        this.playCount = num2;
        this.duration = l;
    }
}
