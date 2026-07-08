package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes30.dex */
public final class Feed {

    @C09CT("extra")
    public final FeedExtra extra;

    @C09CT("feed_item_source_type")
    public final Integer feedItemSourceType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("impression_info")
    public final ImpressionInfo impressionInfo;

    @C09CT("live")
    public final Live live;

    @C09CT("type")
    public final Integer type;

    @C09CT("video")
    public final Video video;

    public Feed() {
        this(null, null, null, null, null, null, null);
    }

    public Feed(String str, Integer num, Live live, Video video, Integer num2, ImpressionInfo impressionInfo, FeedExtra feedExtra) {
        this.id = str;
        this.type = num;
        this.live = live;
        this.video = video;
        this.feedItemSourceType = num2;
        this.impressionInfo = impressionInfo;
        this.extra = feedExtra;
    }
}
