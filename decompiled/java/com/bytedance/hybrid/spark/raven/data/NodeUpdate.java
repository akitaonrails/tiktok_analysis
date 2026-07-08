package com.bytedance.hybrid.spark.raven.data;

import X.C09CT;
import X.C18JI;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class NodeUpdate implements Serializable {
    public static final C18JI Companion = new Object() { // from class: X.18JI
    };

    @C09CT("node")
    public final String node;

    @C09CT("type")
    public final String type;

    public NodeUpdate() {
        this(null, null);
    }

    public NodeUpdate(String str, String str2) {
        this.type = str;
        this.node = str2;
    }
}
