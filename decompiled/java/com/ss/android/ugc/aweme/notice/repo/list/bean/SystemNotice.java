package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes.dex */
public class SystemNotice {

    @C09CT("aweme")
    public Aweme aweme;

    @C09CT("content")
    public String content;

    public Aweme getAweme() {
        return this.aweme;
    }

    public String getContent() {
        return this.content;
    }

    public void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public void setContent(String str) {
        this.content = str;
    }
}
