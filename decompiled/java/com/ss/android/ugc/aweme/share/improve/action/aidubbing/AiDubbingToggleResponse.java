package com.ss.android.ugc.aweme.share.improve.action.aidubbing;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class AiDubbingToggleResponse {

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public AiDubbingToggleResponse() {
        this(null, null);
    }

    public AiDubbingToggleResponse(Integer num, String str) {
        this.statusCode = num;
        this.statusMsg = str;
    }
}
