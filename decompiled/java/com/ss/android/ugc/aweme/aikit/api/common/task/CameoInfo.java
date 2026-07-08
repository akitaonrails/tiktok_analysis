package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CameoInfo implements Serializable {

    @C09CT("cameo_asset_info")
    public final CameoAssetInfo cameoAssetInfo;

    @C09CT("cameo_metrics_info")
    public final CameoMetricsInfo cameoMetricsInfo;

    @C09CT("followers")
    public final Long followers;

    @C09CT("uniq_id")
    public final String uniqId;

    @C09CT("user_base_info")
    public final UserBaseInfo userBaseInfo;

    public CameoInfo() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameoInfo)) {
            return false;
        }
        CameoInfo cameoInfo = (CameoInfo) obj;
        return Intrinsics.LJFF(this.cameoAssetInfo, cameoInfo.cameoAssetInfo) && Intrinsics.LJFF(this.followers, cameoInfo.followers) && Intrinsics.LJFF(this.userBaseInfo, cameoInfo.userBaseInfo) && Intrinsics.LJFF(this.uniqId, cameoInfo.uniqId) && Intrinsics.LJFF(this.cameoMetricsInfo, cameoInfo.cameoMetricsInfo);
    }

    public int hashCode() {
        CameoAssetInfo cameoAssetInfo = this.cameoAssetInfo;
        int iHashCode = (cameoAssetInfo == null ? 0 : cameoAssetInfo.hashCode()) * 31;
        Long l = this.followers;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        UserBaseInfo userBaseInfo = this.userBaseInfo;
        int iHashCode3 = (iHashCode2 + (userBaseInfo == null ? 0 : userBaseInfo.hashCode())) * 31;
        String str = this.uniqId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        CameoMetricsInfo cameoMetricsInfo = this.cameoMetricsInfo;
        return iHashCode4 + (cameoMetricsInfo != null ? cameoMetricsInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameoInfo(cameoAssetInfo=");
        sbLIZ.append(this.cameoAssetInfo);
        sbLIZ.append(", followers=");
        sbLIZ.append(this.followers);
        sbLIZ.append(", userBaseInfo=");
        sbLIZ.append(this.userBaseInfo);
        sbLIZ.append(", uniqId=");
        sbLIZ.append(this.uniqId);
        sbLIZ.append(", cameoMetricsInfo=");
        sbLIZ.append(this.cameoMetricsInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CameoInfo(CameoAssetInfo cameoAssetInfo, Long l, UserBaseInfo userBaseInfo, String str, CameoMetricsInfo cameoMetricsInfo) {
        this.cameoAssetInfo = cameoAssetInfo;
        this.followers = l;
        this.userBaseInfo = userBaseInfo;
        this.uniqId = str;
        this.cameoMetricsInfo = cameoMetricsInfo;
    }
}
