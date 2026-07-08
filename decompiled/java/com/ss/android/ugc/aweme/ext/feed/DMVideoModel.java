package com.ss.android.ugc.aweme.ext.feed;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class DMVideoModel {

    @C09CT("fallback_api")
    public final FallbackApi fallbackApi;

    @C09CT("message")
    public final String message;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    @C09CT("url_expire")
    public final long urlExpire;

    @C09CT("version")
    public final int version;

    @C09CT("video_duration")
    public final double vidDuration;

    @C09CT("video_id")
    public final String videoId;

    @C09CT("video_list")
    public final List<VideoItems> videoList;

    public DMVideoModel(String str, String str2, int i, String str3, double d, long j, FallbackApi fallbackApi, List<VideoItems> list) {
        this.status = str;
        this.message = str2;
        this.version = i;
        this.videoId = str3;
        this.vidDuration = d;
        this.urlExpire = j;
        this.fallbackApi = fallbackApi;
        this.videoList = list;
    }
}
