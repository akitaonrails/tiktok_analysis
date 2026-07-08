package com.ss.android.ugc.aweme.minis.performance.h5.preload.predownload;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class MinisManifestData implements Serializable {
    public static final int $stable = 8;

    @C09CT("name")
    public final String name;

    @C09CT("resource_list")
    public final List<MinisResourceData> resourceList;

    public MinisManifestData() {
        this(null, null, 3, null);
    }

    public MinisManifestData(String str, List<MinisResourceData> list) {
        this.name = str;
        this.resourceList = list;
    }

    public MinisManifestData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
