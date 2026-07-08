package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class ScmLabelInfo implements Serializable {

    @C09CT("content")
    public final String content;

    @C09CT("learn_more_url")
    public final String learnMoreUrl;

    public ScmLabelInfo() {
        this("", "");
    }

    public ScmLabelInfo(String str, String str2) {
        this.content = str;
        this.learnMoreUrl = str2;
    }
}
