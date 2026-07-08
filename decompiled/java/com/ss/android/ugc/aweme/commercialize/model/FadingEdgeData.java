package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class FadingEdgeData implements Serializable {

    @C09CT("edge_type")
    public final String edgeType;

    @C09CT("length")
    public final int length;

    @C09CT("len_type")
    public final String lengthType;

    public FadingEdgeData() {
        this("", "", -1);
    }

    public final String getEdgeType() {
        return this.edgeType;
    }

    public final int getLength() {
        return this.length;
    }

    public final String getLengthType() {
        return this.lengthType;
    }

    public FadingEdgeData(String str, String str2, int i) {
        this.edgeType = str;
        this.lengthType = str2;
        this.length = i;
    }
}
