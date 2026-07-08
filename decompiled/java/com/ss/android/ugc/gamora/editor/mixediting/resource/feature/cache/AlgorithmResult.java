package com.ss.android.ugc.gamora.editor.mixediting.resource.feature.cache;

import X.C09CT;
import X.C13BV;
import X.C2262108tf;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class AlgorithmResult implements Serializable {
    public static final int $stable = 8;

    @C09CT("algorithm_version")
    public final String algorithmVersion;

    @C09CT("extract_bitmap_count")
    public final int extractBitmapCount;

    @C09CT("results")
    public final List<C2262108tf> results;

    public AlgorithmResult() {
        this(null, 0, null, 7, null);
    }

    public AlgorithmResult(List<C2262108tf> list, int i, String str) {
        this.results = list;
        this.extractBitmapCount = i;
        this.algorithmVersion = str;
    }

    public AlgorithmResult(List list, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str);
    }
}
