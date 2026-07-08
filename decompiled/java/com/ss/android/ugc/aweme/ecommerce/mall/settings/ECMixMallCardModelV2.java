package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMixMallCardModelV2 {

    @C09CT("action")
    public final String action;

    @C09CT("container_type")
    public final String containerType;

    @C09CT("count")
    public final int count;

    @C09CT("bff_type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECMixMallCardModelV2)) {
            return false;
        }
        ECMixMallCardModelV2 eCMixMallCardModelV2 = (ECMixMallCardModelV2) obj;
        return Intrinsics.LJFF(this.type, eCMixMallCardModelV2.type) && Intrinsics.LJFF(this.containerType, eCMixMallCardModelV2.containerType) && this.count == eCMixMallCardModelV2.count && Intrinsics.LJFF(this.action, eCMixMallCardModelV2.action);
    }

    public final int hashCode() {
        return (((((this.type.hashCode() * 31) + this.containerType.hashCode()) * 31) + this.count) * 31) + this.action.hashCode();
    }

    public ECMixMallCardModelV2() {
        this("", "", 0, "");
    }

    public ECMixMallCardModelV2(String str, String str2, int i, String str3) {
        this.type = str;
        this.containerType = str2;
        this.count = i;
        this.action = str3;
    }
}
