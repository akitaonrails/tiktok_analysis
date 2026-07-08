package com.ss.android.ugc.aweme.slash.data;

import X.C09CT;
import X.C1180950gpx;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class NodeUpdate implements Serializable {
    public static final C1180950gpx Companion = new Object() { // from class: X.0gpx
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
