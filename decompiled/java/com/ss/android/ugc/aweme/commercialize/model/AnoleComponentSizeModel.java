package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleComponentSizeModel implements Serializable {

    @C09CT("height")
    public final double height;

    @C09CT("type")
    public final String type;

    @C09CT("width")
    public final double width;

    public AnoleComponentSizeModel(String str, double d, double d2) {
        this.type = str;
        this.width = d;
        this.height = d2;
    }
}
