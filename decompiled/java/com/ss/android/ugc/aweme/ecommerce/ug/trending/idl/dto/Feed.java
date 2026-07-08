package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class Feed implements Serializable {

    @C09CT("extra")
    public final FeedExtra extra;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("live")
    public final Live live;

    @C09CT("schema")
    public final String schema;

    @C09CT("track_params")
    public final String trackParams;

    @C09CT("type")
    public final Integer type;

    @C09CT("video")
    public final Video video;

    public Feed() {
        this(null, null, null, null, "", null, null);
    }

    public Feed(String str, Integer num, Live live, Video video, String str2, FeedExtra feedExtra, String str3) {
        this.id = str;
        this.type = num;
        this.live = live;
        this.video = video;
        this.schema = str2;
        this.extra = feedExtra;
        this.trackParams = str3;
    }
}
