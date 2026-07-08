package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class StreamUrlModel implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("rtmp_pull_url")
    public String rtmpPullUrl;

    public String getId() {
        return this.id;
    }

    public String getRtmpPullUrl() {
        return this.rtmpPullUrl;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setRtmpPullUrl(String str) {
        this.rtmpPullUrl = str;
    }
}
