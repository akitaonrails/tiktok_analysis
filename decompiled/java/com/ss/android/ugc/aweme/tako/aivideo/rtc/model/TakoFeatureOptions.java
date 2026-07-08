package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class TakoFeatureOptions {

    @C09CT("agentUserID")
    public final String agentUserID;

    @C09CT("bizId")
    public final String bizId;

    @C09CT("roomId")
    public final String roomId;

    @C09CT("userId")
    public final String userId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoFeatureOptions)) {
            return false;
        }
        TakoFeatureOptions takoFeatureOptions = (TakoFeatureOptions) obj;
        return Intrinsics.LJFF(this.agentUserID, takoFeatureOptions.agentUserID) && Intrinsics.LJFF(this.roomId, takoFeatureOptions.roomId) && Intrinsics.LJFF(this.userId, takoFeatureOptions.userId) && Intrinsics.LJFF(this.bizId, takoFeatureOptions.bizId);
    }

    public final int hashCode() {
        return (((((this.agentUserID.hashCode() * 31) + this.roomId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.bizId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoFeatureOptions(agentUserID=");
        sbLIZ.append(this.agentUserID);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", bizId=");
        sbLIZ.append(this.bizId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoFeatureOptions() {
        this("", "", "", "");
    }

    public TakoFeatureOptions(String str, String str2, String str3, String str4) {
        this.agentUserID = str;
        this.roomId = str2;
        this.userId = str3;
        this.bizId = str4;
    }
}
