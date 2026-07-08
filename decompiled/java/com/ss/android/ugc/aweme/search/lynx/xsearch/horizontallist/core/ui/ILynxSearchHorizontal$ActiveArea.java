package com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class ILynxSearchHorizontal$ActiveArea implements Serializable {
    public static final int $stable = 8;

    @C09CT("height")
    public float height;

    @C09CT("width")
    public float width;

    @C09CT("x")
    public float x;

    @C09CT("y")
    public float y;

    public ILynxSearchHorizontal$ActiveArea() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setY(float f) {
        this.y = f;
    }

    public ILynxSearchHorizontal$ActiveArea(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
    }
}
