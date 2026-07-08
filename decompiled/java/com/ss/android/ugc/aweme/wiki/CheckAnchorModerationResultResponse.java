package com.ss.android.ugc.aweme.wiki;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class CheckAnchorModerationResultResponse implements Serializable {

    @C09CT("status_code")
    public final int code;

    @C09CT("status_msg")
    public final String msg;

    @C09CT("review_result_type")
    public final Integer reviewResultType;

    @C09CT("review_text")
    public final String reviewText;

    public CheckAnchorModerationResultResponse(int i, String str, Integer num, String str2) {
        this.code = i;
        this.msg = str;
        this.reviewResultType = num;
        this.reviewText = str2;
    }
}
