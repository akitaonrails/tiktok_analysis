package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class AuthorizedCheckResult implements Serializable {

    @C09CT("result_code")
    public final Integer resultCode;

    @C09CT("result_msg")
    public final String resultMsg;

    public AuthorizedCheckResult() {
        this(null, null);
    }

    public AuthorizedCheckResult(Integer num, String str) {
        this.resultCode = num;
        this.resultMsg = str;
    }
}
