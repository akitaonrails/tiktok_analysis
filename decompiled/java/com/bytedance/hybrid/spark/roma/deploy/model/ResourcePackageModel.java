package com.bytedance.hybrid.spark.roma.deploy.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ResourcePackageModel {

    @C09CT("channel")
    public final String channel;

    @C09CT("public_path")
    public final String publicPath;

    @C09CT("resources")
    public final List<String> resources;

    @C09CT("type")
    public final ResourceType type;

    @C09CT("priority")
    public final UpdatePriority updatePriority;

    @C09CT("version")
    public final String version;

    public ResourcePackageModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public ResourcePackageModel(ResourceType resourceType, String str, String str2, String str3, UpdatePriority updatePriority, List<String> list) {
        this.type = resourceType;
        this.version = str;
        this.publicPath = str2;
        this.channel = str3;
        this.updatePriority = updatePriority;
        this.resources = list;
    }

    public ResourcePackageModel(ResourceType resourceType, String str, String str2, String str3, UpdatePriority updatePriority, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ResourceType.UNKNOWN : resourceType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? UpdatePriority.ON_DEMAND : updatePriority, (i & 32) != 0 ? C13BV.INSTANCE : list);
    }
}
