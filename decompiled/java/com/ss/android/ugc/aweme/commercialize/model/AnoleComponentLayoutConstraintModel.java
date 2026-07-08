package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleComponentLayoutConstraintModel implements Serializable {

    @C09CT("align_edge")
    public final String alignEdge;

    @C09CT("baseline")
    public final String baseline;

    @C09CT("offset")
    public final double offset;

    public AnoleComponentLayoutConstraintModel(String str, String str2, double d) {
        this.baseline = str;
        this.alignEdge = str2;
        this.offset = d;
    }
}
