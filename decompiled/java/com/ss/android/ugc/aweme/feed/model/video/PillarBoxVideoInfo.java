package com.ss.android.ugc.aweme.feed.model.video;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class PillarBoxVideoInfo implements Serializable {

    @C09CT("bottom")
    public float bottom;

    @C09CT("left")
    public float left;

    @C09CT("right")
    public float right;

    @C09CT("top")
    public float top;

    @C09CT("version")
    public String version;

    public PillarBoxVideoInfo() {
        this(0.0f, 0.0f, 0.0f, 0.0f, "");
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PillarBoxVideoInfo(top=");
        sbLIZ.append(this.top);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.bottom);
        sbLIZ.append(", left=");
        sbLIZ.append(this.left);
        sbLIZ.append(", right=");
        sbLIZ.append(this.right);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public final String getVersion() {
        return this.version;
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

    public final void setVersion(String str) {
        this.version = str;
    }

    public PillarBoxVideoInfo(float f, float f2, float f3, float f4, String str) {
        this.top = f;
        this.bottom = f2;
        this.left = f3;
        this.right = f4;
        this.version = str;
    }
}
