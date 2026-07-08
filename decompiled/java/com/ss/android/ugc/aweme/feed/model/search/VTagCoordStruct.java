package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class VTagCoordStruct implements Serializable {

    @C09CT("x")
    public float x;

    @C09CT("y")
    public float y;

    public VTagCoordStruct() {
        this(-1.0f, -1.0f);
    }

    public VTagCoordStruct(float f, float f2) {
        this.x = f;
        this.y = f2;
    }
}
