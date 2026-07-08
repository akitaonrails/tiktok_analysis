package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentTopBarIconStyle implements Serializable {

    @C09CT("radius")
    public Integer radius;

    @C09CT("size")
    public Integer size;

    public CommentTopBarIconStyle() {
        this(null, null);
    }

    public final void setRadius(Integer num) {
        this.radius = num;
    }

    public final void setSize(Integer num) {
        this.size = num;
    }

    public CommentTopBarIconStyle(Integer num, Integer num2) {
        this.size = num;
        this.radius = num2;
    }
}
