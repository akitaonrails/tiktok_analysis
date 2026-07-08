package com.ss.android.ugc.aweme.authorize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class CopyRightResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("has_copyright")
    public final Boolean hasCopyright;

    @C09CT("schema")
    public final String schema;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public CopyRightResponse() {
        this(null, null, null, null);
    }

    public CopyRightResponse(String str, Boolean bool, Integer num, String str2) {
        this.schema = str;
        this.hasCopyright = bool;
        this.statusCode = num;
        this.statusMsg = str2;
    }
}
