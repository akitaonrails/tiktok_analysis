package com.bytedance.hybrid.spark.roma.deploy.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ResourceType {

    @C09CT(alternate = {"CDN"}, value = "cdn")
    public static final ResourceType CDN;

    @C09CT(alternate = {"GECKO"}, value = "gecko")
    public static final ResourceType GECKO;
    public static final /* synthetic */ ResourceType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT(alternate = {"UNKNOWN"}, value = "unknown")
    public static final ResourceType UNKNOWN;

    public static InterfaceC2044707zh<ResourceType> getEntries() {
        return LLILLJJLI;
    }

    static {
        ResourceType resourceType = new ResourceType("GECKO", 0);
        GECKO = resourceType;
        ResourceType resourceType2 = new ResourceType("CDN", 1);
        CDN = resourceType2;
        ResourceType resourceType3 = new ResourceType("UNKNOWN", 2);
        UNKNOWN = resourceType3;
        ResourceType[] resourceTypeArr = {resourceType, resourceType2, resourceType3};
        LL = resourceTypeArr;
        LLILLJJLI = new C2254308sP(resourceTypeArr);
    }

    public static ResourceType[] values() {
        return (ResourceType[]) LL.clone();
    }

    public static ResourceType valueOf(String str) {
        return (ResourceType) C08FF.LIZ(ResourceType.class, str);
    }

    public ResourceType(String str, int i) {
    }
}
