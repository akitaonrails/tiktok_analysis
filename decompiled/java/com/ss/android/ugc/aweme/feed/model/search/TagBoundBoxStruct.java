package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TagBoundBoxStruct implements Serializable {

    @C09CT("xmax")
    public Float xmax;

    @C09CT("xmin")
    public Float xmin;

    @C09CT("ymax")
    public Float ymax;

    @C09CT("ymin")
    public Float ymin;

    public TagBoundBoxStruct() {
    }

    public final TagBoundBoxStruct copy(Float f, Float f2, Float f3, Float f4) {
        return new TagBoundBoxStruct(f, f2, f3, f4);
    }

    public TagBoundBoxStruct(Float f, Float f2, Float f3, Float f4) {
        this.xmin = f;
        this.ymin = f2;
        this.xmax = f3;
        this.ymax = f4;
    }
}
