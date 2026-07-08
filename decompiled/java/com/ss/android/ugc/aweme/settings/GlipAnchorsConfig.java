package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class GlipAnchorsConfig {

    @C09CT("anchors_list")
    public final List<Integer> anchorsList;

    @C09CT("enable")
    public final boolean enable;

    public GlipAnchorsConfig() {
        this(false, null, 3, null);
    }

    public GlipAnchorsConfig(boolean z, List<Integer> list) {
        this.enable = z;
        this.anchorsList = list;
    }

    public GlipAnchorsConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? Collections.singletonList(95) : list);
    }
}
