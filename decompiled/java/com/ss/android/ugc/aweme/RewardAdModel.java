package com.ss.android.ugc.aweme;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class RewardAdModel implements Serializable {

    @C09CT("aweme_id")
    public final String aid;

    @C09CT("author")
    public final User author;

    @C09CT("raw_ad_data")
    public final AwemeRawAd awemeRawAd;

    @C09CT("video")
    public final Video video;

    public RewardAdModel(String str, Video video, User user, AwemeRawAd awemeRawAd) {
        this.aid = str;
        this.video = video;
        this.author = user;
        this.awemeRawAd = awemeRawAd;
    }
}
