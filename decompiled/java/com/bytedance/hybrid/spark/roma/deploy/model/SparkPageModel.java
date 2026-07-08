package com.bytedance.hybrid.spark.roma.deploy.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class SparkPageModel {

    @C09CT("entry")
    public final String entry;

    @C09CT("preload_resources")
    public final List<String> preloadResources;

    public SparkPageModel() {
        this(null, null, 3, null);
    }

    public SparkPageModel(String str, List<String> list) {
        this.entry = str;
        this.preloadResources = list;
    }

    public SparkPageModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
