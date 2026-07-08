package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class CommentRethinkPopup implements Serializable {

    @C09CT("body")
    public String body;

    @C09CT("format")
    public int format;

    @C09CT("highlight")
    public String highlight;

    @C09CT("link")
    public final String link;

    @C09CT("strategy")
    public int strategy;

    @C09CT("title")
    public String title;

    public CommentRethinkPopup() {
        this("", "", "", "", 0, 0);
    }

    public final String getBody() {
        return this.body;
    }

    public final int getFormat() {
        return this.format;
    }

    public final String getHighlight() {
        return this.highlight;
    }

    public final String getLink() {
        return this.link;
    }

    public final int getStrategy() {
        return this.strategy;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBody(String str) {
        this.body = str;
    }

    public final void setFormat(int i) {
        this.format = i;
    }

    public final void setHighlight(String str) {
        this.highlight = str;
    }

    public final void setStrategy(int i) {
        this.strategy = i;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public CommentRethinkPopup(String str, String str2, String str3, String str4, int i, int i2) {
        this.title = str;
        this.body = str2;
        this.highlight = str3;
        this.link = str4;
        this.strategy = i;
        this.format = i2;
    }
}
