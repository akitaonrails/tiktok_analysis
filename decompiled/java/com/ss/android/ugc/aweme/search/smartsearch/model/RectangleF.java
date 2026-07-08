package com.ss.android.ugc.aweme.search.smartsearch.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class RectangleF implements Serializable {

    @C09CT("bottom")
    public float bottom;

    @C09CT("left")
    public float left;

    @C09CT("right")
    public float right;

    @C09CT("top")
    public float top;

    public RectangleF() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setLeft(float f) {
        this.left = f;
    }

    public final void setRight(float f) {
        this.right = f;
    }

    public final void setTop(float f) {
        this.top = f;
    }

    public RectangleF(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }
}
