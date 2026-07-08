package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CameoAssetInfo implements Serializable {

    @C09CT("cameo_id")
    public final String cameoId;

    @C09CT("cameo_image")
    public final ImageInfo cameoImage;

    @C09CT("is_virtual")
    public final Boolean isVirtual;

    public CameoAssetInfo() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameoAssetInfo)) {
            return false;
        }
        CameoAssetInfo cameoAssetInfo = (CameoAssetInfo) obj;
        return Intrinsics.LJFF(this.cameoId, cameoAssetInfo.cameoId) && Intrinsics.LJFF(this.cameoImage, cameoAssetInfo.cameoImage) && Intrinsics.LJFF(this.isVirtual, cameoAssetInfo.isVirtual);
    }

    public int hashCode() {
        String str = this.cameoId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ImageInfo imageInfo = this.cameoImage;
        int iHashCode2 = (iHashCode + (imageInfo == null ? 0 : imageInfo.hashCode())) * 31;
        Boolean bool = this.isVirtual;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameoAssetInfo(cameoId=");
        sbLIZ.append(this.cameoId);
        sbLIZ.append(", cameoImage=");
        sbLIZ.append(this.cameoImage);
        sbLIZ.append(", isVirtual=");
        sbLIZ.append(this.isVirtual);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isVirtual() {
        return this.isVirtual;
    }

    public CameoAssetInfo(String str, ImageInfo imageInfo, Boolean bool) {
        this.cameoId = str;
        this.cameoImage = imageInfo;
        this.isVirtual = bool;
    }
}
