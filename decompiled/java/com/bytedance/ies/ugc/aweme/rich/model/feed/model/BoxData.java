package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class BoxData implements Serializable {

    @C09CT("box")
    public final Coordinate box;

    @C09CT("timestamp_MS")
    public final int timestampMS;

    public BoxData() {
        this(null, 0);
    }

    public BoxData(Coordinate coordinate, int i) {
        this.box = coordinate;
        this.timestampMS = i;
    }
}
