package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentTopBarText implements Serializable {

    @C09CT("content")
    public String content;

    @C09CT("margin")
    public CommentTopBarMargin margin;

    @C09CT("padding")
    public CommentTopBarPadding padding;

    @C09CT("text_style")
    public CommentTopBarTextStyle textStyle;

    public CommentTopBarText() {
        this(null, null, null, null);
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setMargin(CommentTopBarMargin commentTopBarMargin) {
        this.margin = commentTopBarMargin;
    }

    public final void setPadding(CommentTopBarPadding commentTopBarPadding) {
        this.padding = commentTopBarPadding;
    }

    public final void setTextStyle(CommentTopBarTextStyle commentTopBarTextStyle) {
        this.textStyle = commentTopBarTextStyle;
    }

    public CommentTopBarText(String str, CommentTopBarTextStyle commentTopBarTextStyle, CommentTopBarPadding commentTopBarPadding, CommentTopBarMargin commentTopBarMargin) {
        this.content = str;
        this.textStyle = commentTopBarTextStyle;
        this.padding = commentTopBarPadding;
        this.margin = commentTopBarMargin;
    }
}
