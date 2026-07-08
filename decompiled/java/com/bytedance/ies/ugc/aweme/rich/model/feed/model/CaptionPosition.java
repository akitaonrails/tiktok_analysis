package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class CaptionPosition implements Serializable {

    @C09CT("horizontal")
    public final Float horizontal;

    @C09CT("vertical")
    public final List<Float> vertical;

    public CaptionPosition() {
        this(null, null, 3, null);
    }

    public CaptionPosition(List<Float> list, Float f) {
        this.vertical = list;
        this.horizontal = f;
    }

    public CaptionPosition(List list, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? Float.valueOf(0.5f) : f);
    }
}
