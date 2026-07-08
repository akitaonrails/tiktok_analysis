package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ShaderViewPosition implements Serializable {

    @C09CT("x")
    public String x;

    @C09CT("y")
    public String y;

    public ShaderViewPosition() {
        this("", "");
    }

    public final String getX() {
        return this.x;
    }

    public final String getY() {
        return this.y;
    }

    public final void setX(String str) {
        this.x = str;
    }

    public final void setY(String str) {
        this.y = str;
    }

    public ShaderViewPosition(String str, String str2) {
        this.x = str;
        this.y = str2;
    }
}
