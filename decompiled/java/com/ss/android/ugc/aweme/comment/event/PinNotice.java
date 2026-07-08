package com.ss.android.ugc.aweme.comment.event;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class PinNotice {

    @C09CT("body")
    public final String body;

    @C09CT("pin")
    public final String pin;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final int type;

    @C09CT("unpin")
    public final String unpin;

    public PinNotice() {
        this(0, "", "", "", "");
    }

    public PinNotice(int i, String str, String str2, String str3, String str4) {
        this.type = i;
        this.title = str;
        this.body = str2;
        this.pin = str3;
        this.unpin = str4;
    }
}
