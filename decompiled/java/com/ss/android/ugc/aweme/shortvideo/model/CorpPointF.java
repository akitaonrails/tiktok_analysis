package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class CorpPointF implements Serializable {

    @C09CT("x")
    public float x;

    @C09CT("y")
    public float y;

    public CorpPointF() {
        this(0.0f, 0.0f);
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    public CorpPointF(float f, float f2) {
        this.x = f;
        this.y = f2;
    }
}
