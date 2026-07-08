package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CameoMentionInfo {

    @C09CT("cameo_asset_info")
    public final CameoAssetInfo cameoAssetInfo;

    @C09CT("followers")
    public final Long followers;

    @C09CT("user_base_info")
    public final UserBaseInfo userBaseInfo;

    public CameoMentionInfo() {
        this(null, null, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameoMentionInfo)) {
            return false;
        }
        CameoMentionInfo cameoMentionInfo = (CameoMentionInfo) obj;
        return Intrinsics.LJFF(this.userBaseInfo, cameoMentionInfo.userBaseInfo) && Intrinsics.LJFF(this.cameoAssetInfo, cameoMentionInfo.cameoAssetInfo) && Intrinsics.LJFF(this.followers, cameoMentionInfo.followers);
    }

    public final int hashCode() {
        UserBaseInfo userBaseInfo = this.userBaseInfo;
        int iHashCode = (userBaseInfo == null ? 0 : userBaseInfo.hashCode()) * 31;
        CameoAssetInfo cameoAssetInfo = this.cameoAssetInfo;
        int iHashCode2 = (iHashCode + (cameoAssetInfo == null ? 0 : cameoAssetInfo.hashCode())) * 31;
        Long l = this.followers;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameoMentionInfo(userBaseInfo=");
        sbLIZ.append(this.userBaseInfo);
        sbLIZ.append(", cameoAssetInfo=");
        sbLIZ.append(this.cameoAssetInfo);
        sbLIZ.append(", followers=");
        sbLIZ.append(this.followers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CameoMentionInfo(UserBaseInfo userBaseInfo, CameoAssetInfo cameoAssetInfo, Long l) {
        this.userBaseInfo = userBaseInfo;
        this.cameoAssetInfo = cameoAssetInfo;
        this.followers = l;
    }
}
