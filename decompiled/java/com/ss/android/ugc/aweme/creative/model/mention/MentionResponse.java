package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class MentionResponse {

    @C09CT("data")
    public final MentionData data;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public MentionResponse() {
        this(null, null, null);
    }

    public MentionResponse(Integer num, String str, MentionData mentionData) {
        this.statusCode = num;
        this.statusMsg = str;
        this.data = mentionData;
    }
}
