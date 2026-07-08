package com.ss.android.ugc.aweme.im.service.service;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class ConstructMessageContentPbResponse {

    @C09CT("content_pb")
    public final String contentPb;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public ConstructMessageContentPbResponse() {
        this(0, "", null);
    }

    public ConstructMessageContentPbResponse(int i, String str, String str2) {
        this.statusCode = i;
        this.statusMsg = str;
        this.contentPb = str2;
    }
}
