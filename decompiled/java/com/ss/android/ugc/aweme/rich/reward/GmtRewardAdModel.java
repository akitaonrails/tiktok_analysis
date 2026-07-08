package com.ss.android.ugc.aweme.rich.reward;

import X.C09CT;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.Video;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class GmtRewardAdModel implements Serializable {

    @C09CT("aweme_id")
    public final String aid;

    @C09CT("author")
    public final GmtRewardAdUser author;

    @C09CT("raw_ad_data")
    public final GMTBaseModel awemeRawAd;

    @C09CT("aweme_type")
    public final Integer awemeType;

    @C09CT("image_post_info")
    public final ImagePostInfo imagePostInfo;

    @C09CT("video")
    public final Video video;

    public GmtRewardAdModel() {
        this(null, null, null, null, null, null);
    }

    public GmtRewardAdModel(String str, Video video, GmtRewardAdUser gmtRewardAdUser, GMTBaseModel gMTBaseModel, Integer num, ImagePostInfo imagePostInfo) {
        this.aid = str;
        this.video = video;
        this.author = gmtRewardAdUser;
        this.awemeRawAd = gMTBaseModel;
        this.awemeType = num;
        this.imagePostInfo = imagePostInfo;
    }
}
