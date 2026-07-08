package com.ss.android.ugc.aweme.discover.model;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.ReplaceLineEndAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ChallengeDisclaimer implements Serializable {

    @C09CT("content")
    @C09CS(ReplaceLineEndAdapter.class)
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
