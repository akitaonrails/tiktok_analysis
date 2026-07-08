package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MainPendingFootNoteInfo implements Serializable {

    @C09CT("footnote_author_id")
    public String footNoteAuthorId;

    @C09CT("source_redirect")
    public String link;

    @C09CT("source_display")
    public String linkText;

    @C09CT("footnote_id")
    public String noteID;

    @C09CT("rate_result")
    public Integer rateResult;

    @C09CT("title")
    public String title;

    public MainPendingFootNoteInfo() {
        this(null, null, null, 0, null, null);
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setLinkText(String str) {
        this.linkText = str;
    }

    public final void setRateResult(Integer num) {
        this.rateResult = num;
    }

    public MainPendingFootNoteInfo(String str, String str2, String str3, Integer num, String str4, String str5) {
        this.noteID = str;
        this.footNoteAuthorId = str2;
        this.title = str3;
        this.rateResult = num;
        this.linkText = str4;
        this.link = str5;
    }
}
