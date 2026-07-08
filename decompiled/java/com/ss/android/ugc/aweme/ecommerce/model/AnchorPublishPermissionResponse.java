package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AnchorPublishPermissionResponse extends BaseResponse {

    @C09CT("photomode_anchor_permission")
    public final AnchorPublishPermission photoModeAnchorPermission;

    @C09CT("video_anchor_permission")
    public final AnchorPublishPermission videoAnchorPermission;

    public AnchorPublishPermissionResponse() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorPublishPermissionResponse)) {
            return false;
        }
        AnchorPublishPermissionResponse anchorPublishPermissionResponse = (AnchorPublishPermissionResponse) obj;
        return Intrinsics.LJFF(this.photoModeAnchorPermission, anchorPublishPermissionResponse.photoModeAnchorPermission) && Intrinsics.LJFF(this.videoAnchorPermission, anchorPublishPermissionResponse.videoAnchorPermission);
    }

    public final int hashCode() {
        AnchorPublishPermission anchorPublishPermission = this.photoModeAnchorPermission;
        int iHashCode = (anchorPublishPermission == null ? 0 : anchorPublishPermission.hashCode()) * 31;
        AnchorPublishPermission anchorPublishPermission2 = this.videoAnchorPermission;
        return iHashCode + (anchorPublishPermission2 != null ? anchorPublishPermission2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorPublishPermissionResponse(photoModeAnchorPermission=");
        sbLIZ.append(this.photoModeAnchorPermission);
        sbLIZ.append(", videoAnchorPermission=");
        sbLIZ.append(this.videoAnchorPermission);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnchorPublishPermissionResponse(AnchorPublishPermission anchorPublishPermission, AnchorPublishPermission anchorPublishPermission2) {
        this.photoModeAnchorPermission = anchorPublishPermission;
        this.videoAnchorPermission = anchorPublishPermission2;
    }
}
