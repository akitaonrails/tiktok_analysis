package com.ss.android.ugc.aweme.rss.api.models;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class UpdateRssResponse {

    @C09CT("status_msg")
    public final String msg;

    @C09CT("status_code")
    public final Integer statusCode;

    public UpdateRssResponse(Integer num, String str) {
        this.statusCode = num;
        this.msg = str;
    }
}
