package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentTopBarContainer implements Serializable {

    @C09CT("height")
    public Integer height;

    @C09CT("margin")
    public CommentTopBarMargin margin;

    @C09CT("padding")
    public CommentTopBarPadding padding;

    public CommentTopBarContainer() {
        this(null, null, null);
    }

    public final void setHeight(Integer num) {
        this.height = num;
    }

    public final void setMargin(CommentTopBarMargin commentTopBarMargin) {
        this.margin = commentTopBarMargin;
    }

    public final void setPadding(CommentTopBarPadding commentTopBarPadding) {
        this.padding = commentTopBarPadding;
    }

    public CommentTopBarContainer(Integer num, CommentTopBarPadding commentTopBarPadding, CommentTopBarMargin commentTopBarMargin) {
        this.height = num;
        this.padding = commentTopBarPadding;
        this.margin = commentTopBarMargin;
    }
}
