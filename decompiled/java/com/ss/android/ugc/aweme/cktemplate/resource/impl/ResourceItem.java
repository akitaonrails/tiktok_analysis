package com.ss.android.ugc.aweme.cktemplate.resource.impl;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ResourceItem {

    @C09CT("BaseInfo")
    public final BaseInfo baseInfo;

    @C09CT("CDNList")
    public final List<String> cdnList;

    @C09CT("file_type")
    public final int fileType;

    @C09CT("resource_key")
    public final String resourceKey;

    @C09CT("type")
    public final String type;

    @C09CT("uri")
    public final String uri;

    @C09CT("version")
    public final int version;

    public ResourceItem() {
        this(null, null, null, null, 0, null, 0, 127, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceItem)) {
            return false;
        }
        ResourceItem resourceItem = (ResourceItem) obj;
        return Intrinsics.LJFF(this.resourceKey, resourceItem.resourceKey) && Intrinsics.LJFF(this.cdnList, resourceItem.cdnList) && Intrinsics.LJFF(this.uri, resourceItem.uri) && Intrinsics.LJFF(this.baseInfo, resourceItem.baseInfo) && this.version == resourceItem.version && Intrinsics.LJFF(this.type, resourceItem.type) && this.fileType == resourceItem.fileType;
    }

    public int hashCode() {
        int iHashCode = ((((this.resourceKey.hashCode() * 31) + this.cdnList.hashCode()) * 31) + this.uri.hashCode()) * 31;
        BaseInfo baseInfo = this.baseInfo;
        return ((((((iHashCode + (baseInfo == null ? 0 : baseInfo.hashCode())) * 31) + this.version) * 31) + this.type.hashCode()) * 31) + this.fileType;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResourceItem(resourceKey=");
        sbLIZ.append(this.resourceKey);
        sbLIZ.append(", cdnList=");
        sbLIZ.append(this.cdnList);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", baseInfo=");
        sbLIZ.append(this.baseInfo);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", fileType=");
        sbLIZ.append(this.fileType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ResourceItem(String str, List<String> list, String str2, BaseInfo baseInfo, int i, String str3, int i2) {
        this.resourceKey = str;
        this.cdnList = list;
        this.uri = str2;
        this.baseInfo = baseInfo;
        this.version = i;
        this.type = str3;
        this.fileType = i2;
    }

    public ResourceItem(String str, List list, String str2, BaseInfo baseInfo, int i, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? C13BV.INSTANCE : list, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? null : baseInfo, (i3 & 16) != 0 ? 0 : i, (i3 & 32) == 0 ? str3 : "", (i3 & 64) != 0 ? 0 : i2);
    }
}
