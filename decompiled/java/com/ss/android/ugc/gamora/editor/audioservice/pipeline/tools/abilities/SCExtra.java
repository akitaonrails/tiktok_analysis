package com.ss.android.ugc.gamora.editor.audioservice.pipeline.tools.abilities;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class SCExtra {

    @C09CT("video_warping_map")
    public final List<List<Double>> timeWarp;

    public SCExtra() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SCExtra(List<? extends List<Double>> list) {
        this.timeWarp = list;
    }

    public SCExtra(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
