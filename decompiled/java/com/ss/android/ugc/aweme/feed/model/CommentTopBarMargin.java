package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentTopBarMargin implements Serializable {

    @C09CT("bottom")
    public Integer bottom;

    @C09CT("left")
    public Integer left;

    @C09CT("right")
    public Integer right;

    @C09CT("top")
    public Integer top;

    public CommentTopBarMargin() {
        this(null, null, null, null);
    }

    public final void setBottom(Integer num) {
        this.bottom = num;
    }

    public final void setLeft(Integer num) {
        this.left = num;
    }

    public final void setRight(Integer num) {
        this.right = num;
    }

    public final void setTop(Integer num) {
        this.top = num;
    }

    public CommentTopBarMargin(Integer num, Integer num2, Integer num3, Integer num4) {
        this.top = num;
        this.left = num2;
        this.right = num3;
        this.bottom = num4;
    }
}
