package com.ss.android.ugc.aweme.legoImp.task.dm.ldp;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class URLUploadResponseBody implements Serializable {
    public static final int $stable = 0;

    @C09CT("code")
    public final int code;

    @C09CT("msg")
    public final String msg;

    public URLUploadResponseBody(int i, String str) {
        this.code = i;
        this.msg = str;
    }
}
