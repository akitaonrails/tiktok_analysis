package com.bytedance.hybrid.spark.roma.deploy.model;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class SparkAppDetailsModel {

    @C09CT("access_key")
    public final String accessKey;

    @C09CT("packages")
    public final List<ResourcePackageModel> packages;

    @C09CT("pages")
    public final Map<String, SparkPageModel> pages;

    public SparkAppDetailsModel() {
        this(null, null, null, 7, null);
    }

    public SparkAppDetailsModel(String str, Map<String, SparkPageModel> map, List<ResourcePackageModel> list) {
        this.accessKey = str;
        this.pages = map;
        this.packages = list;
    }

    public SparkAppDetailsModel(String str, Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C2097608Jq.LJ() : map, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
