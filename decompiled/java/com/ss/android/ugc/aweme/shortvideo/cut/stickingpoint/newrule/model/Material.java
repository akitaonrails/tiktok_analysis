package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model;

import X.C09CT;
import X.EnumC2005707tP;

/* JADX INFO: loaded from: classes19.dex */
public final class Material {

    @C09CT("duration")
    public double duration;

    @C09CT("type")
    public final EnumC2005707tP type;

    public Material() {
        this(null, 0.0d);
    }

    public Material(EnumC2005707tP enumC2005707tP, double d) {
        this.type = enumC2005707tP;
        this.duration = d;
    }
}
