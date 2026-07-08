package com.bytedance.live.render.engine.sticker;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class TtlhReceiveExtra {

    @C09CT("node_paths")
    public final List<String> nodePaths;

    @C09CT("node_tags")
    public final List<NodeTag> nodeTags;

    public TtlhReceiveExtra() {
        this(null, null, 3, null);
    }

    public TtlhReceiveExtra(List<String> list, List<NodeTag> list2) {
        this.nodePaths = list;
        this.nodeTags = list2;
    }

    public TtlhReceiveExtra(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
