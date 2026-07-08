package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes19.dex */
public final class MyMomenetsHighlightVideoResponse {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("status_code")
    public final Integer status_code;

    @C09CT("video_url")
    public final String videoURL;

    public MyMomenetsHighlightVideoResponse(Integer num, Integer num2, String str) {
        this.status = num;
        this.status_code = num2;
        this.videoURL = str;
    }
}
