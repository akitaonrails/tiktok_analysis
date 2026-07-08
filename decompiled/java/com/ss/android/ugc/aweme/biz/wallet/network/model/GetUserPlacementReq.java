package com.ss.android.ugc.aweme.biz.wallet.network.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class GetUserPlacementReq implements Serializable {

    @C09CT("biz_entrance")
    public final String bizEntrance;

    @C09CT("from_page")
    public final String fromPage;

    @C09CT("register_scene")
    public final String registerScene;

    @C09CT("risk_info")
    public final String riskInfo;

    public GetUserPlacementReq() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetUserPlacementReq)) {
            return false;
        }
        GetUserPlacementReq getUserPlacementReq = (GetUserPlacementReq) obj;
        return Intrinsics.LJFF(this.bizEntrance, getUserPlacementReq.bizEntrance) && Intrinsics.LJFF(this.fromPage, getUserPlacementReq.fromPage) && Intrinsics.LJFF(this.registerScene, getUserPlacementReq.registerScene) && Intrinsics.LJFF(this.riskInfo, getUserPlacementReq.riskInfo);
    }

    public int hashCode() {
        String str = this.bizEntrance;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fromPage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.registerScene;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.riskInfo;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetUserPlacementReq(bizEntrance=");
        sbLIZ.append(this.bizEntrance);
        sbLIZ.append(", fromPage=");
        sbLIZ.append(this.fromPage);
        sbLIZ.append(", registerScene=");
        sbLIZ.append(this.registerScene);
        sbLIZ.append(", riskInfo=");
        sbLIZ.append(this.riskInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetUserPlacementReq(String str, String str2, String str3, String str4) {
        this.bizEntrance = str;
        this.fromPage = str2;
        this.registerScene = str3;
        this.riskInfo = str4;
    }
}
