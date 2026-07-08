package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class RejectContentBean implements Serializable {

    @C09CT("content")
    public final String content;

    @C09CT("follow_up")
    public final String followUp;

    @C09CT("follow_up_link")
    public final String followUpLink;

    public RejectContentBean() {
        this(null, null, null);
    }

    public RejectContentBean(String str, String str2, String str3) {
        this.content = str;
        this.followUp = str2;
        this.followUpLink = str3;
    }
}
