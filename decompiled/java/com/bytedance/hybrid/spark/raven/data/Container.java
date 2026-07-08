package com.bytedance.hybrid.spark.raven.data;

import X.C09CT;
import X.C1161240gKA;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class Container implements Serializable {
    public static final C1161240gKA Companion = new Object() { // from class: X.0gKA
    };

    @C09CT("name")
    public final String name;

    @C09CT("render_type")
    public final Integer renderType;

    @C09CT("schema")
    public final String schema;

    public Container() {
        this(0, null, null);
    }

    public Container(Integer num, String str, String str2) {
        this.renderType = num;
        this.name = str;
        this.schema = str2;
    }
}
