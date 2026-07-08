package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ECRGBAColor implements Serializable {

    @C09CT("a")
    public final Float a;

    @C09CT("b")
    public final Integer b;

    @C09CT("g")
    public final Integer g;

    @C09CT("r")
    public final Integer r;

    public ECRGBAColor() {
        this(null, null, null, null);
    }

    public ECRGBAColor(Integer num, Integer num2, Integer num3, Float f) {
        this.r = num;
        this.g = num2;
        this.b = num3;
        this.a = f;
    }
}
