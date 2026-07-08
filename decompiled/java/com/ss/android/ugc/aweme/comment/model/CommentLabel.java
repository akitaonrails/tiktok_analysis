package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class CommentLabel implements Serializable {
    public static final long serialVersionUID = 5974802910310825054L;

    @C09CT("color")
    public String color;

    @C09CT("text")
    public String text;

    @C09CT("type")
    public int type;

    @C09CT("url")
    public String url;

    public String getLabelColor() {
        return this.color;
    }

    public String getLabelText() {
        return this.text;
    }

    public int getLabelType() {
        return this.type;
    }

    public String getLabelUrl() {
        return this.url;
    }

    public void setLabelColor(String str) {
        this.color = str;
    }

    public void setLabelText(String str) {
        this.text = str;
    }

    public void setLabelType(int i) {
        this.type = i;
    }

    public void setLabelUrl(String str) {
        this.url = str;
    }
}
