package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentPostInfo implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("is_visible")
    public int isVisible;

    public static final class Companion {
    }

    public CommentPostInfo() {
        this(0);
    }

    public final int isVisible() {
        return this.isVisible;
    }

    public CommentPostInfo(int i) {
        this.isVisible = i;
    }
}
