package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ChallengeAnnouncement implements Serializable {

    @C09CT("body")
    public String content;

    @C09CT("title")
    public String title;

    public String getContent() {
        return this.content;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
