package com.ss.android.ugc.aweme.kids.common.response;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class KMVideoReportReason {

    @C09CT("code")
    public final int code;

    @C09CT("img")
    public final String img;

    @C09CT("text")
    public final String text;

    public KMVideoReportReason() {
        this(-1, "", "");
    }

    public KMVideoReportReason(int i, String str, String str2) {
        this.code = i;
        this.text = str;
        this.img = str2;
    }
}
