package com.ss.android.ugc.aweme.cktemplate.resource.impl;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialResourceRequest {

    @C09CT("access_key")
    public final String accessKey;

    @C09CT("base_info")
    public final MaterialResourceBaseInfo baseInfo;

    @C09CT("resource_key")
    public final String resourceKey;

    public MaterialResourceRequest() {
        this("", null, "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaterialResourceRequest)) {
            return false;
        }
        MaterialResourceRequest materialResourceRequest = (MaterialResourceRequest) obj;
        return Intrinsics.LJFF(this.accessKey, materialResourceRequest.accessKey) && Intrinsics.LJFF(this.baseInfo, materialResourceRequest.baseInfo) && Intrinsics.LJFF(this.resourceKey, materialResourceRequest.resourceKey);
    }

    public int hashCode() {
        int iHashCode = this.accessKey.hashCode() * 31;
        MaterialResourceBaseInfo materialResourceBaseInfo = this.baseInfo;
        return ((iHashCode + (materialResourceBaseInfo == null ? 0 : materialResourceBaseInfo.hashCode())) * 31) + this.resourceKey.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialResourceRequest(accessKey=");
        sbLIZ.append(this.accessKey);
        sbLIZ.append(", baseInfo=");
        sbLIZ.append(this.baseInfo);
        sbLIZ.append(", resourceKey=");
        sbLIZ.append(this.resourceKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MaterialResourceRequest(String str, MaterialResourceBaseInfo materialResourceBaseInfo, String str2) {
        this.accessKey = str;
        this.baseInfo = materialResourceBaseInfo;
        this.resourceKey = str2;
    }
}
