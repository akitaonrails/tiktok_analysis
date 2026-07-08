package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class AnnotationContainerConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_all_scenes")
    public final boolean enableAllScenes;

    @C09CT("support_scenes")
    public final List<String> supportScenes;

    public AnnotationContainerConfig() {
        this(false, null, false, 7, null);
    }

    public AnnotationContainerConfig(boolean z, List<String> list, boolean z2) {
        this.enable = z;
        this.supportScenes = list;
        this.enableAllScenes = z2;
    }

    public AnnotationContainerConfig(boolean z, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? false : z2);
    }
}
