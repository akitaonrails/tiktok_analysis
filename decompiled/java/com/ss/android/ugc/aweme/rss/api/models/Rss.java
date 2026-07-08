package com.ss.android.ugc.aweme.rss.api.models;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes19.dex */
public final class Rss {

    @C09CT("url")
    public final String rssUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    public Rss(String str, int i) {
        this.rssUrl = str;
        this.status = i;
    }
}
