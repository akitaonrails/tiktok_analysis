package com.ss.android.ugc.aweme.share.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes22.dex */
public final class ShortenURLInfo {

    @C09CT("shorten_url")
    public String shareUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    public ShortenURLInfo(int i, String str) {
        this.status = i;
        this.shareUrl = str;
    }
}
