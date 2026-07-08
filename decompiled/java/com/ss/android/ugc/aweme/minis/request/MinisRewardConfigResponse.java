package com.ss.android.ugc.aweme.minis.request;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MinisRewardConfigResponse {

    @C09CT("reward_configs")
    public final List<MinisRewardConfigItem> rewardConfigs;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public MinisRewardConfigResponse() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisRewardConfigResponse)) {
            return false;
        }
        MinisRewardConfigResponse minisRewardConfigResponse = (MinisRewardConfigResponse) obj;
        return Intrinsics.LJFF(this.rewardConfigs, minisRewardConfigResponse.rewardConfigs) && Intrinsics.LJFF(this.statusCode, minisRewardConfigResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, minisRewardConfigResponse.statusMsg);
    }

    public final int hashCode() {
        List<MinisRewardConfigItem> list = this.rewardConfigs;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.statusCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.statusMsg;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRewardConfigResponse(rewardConfigs=");
        sbLIZ.append(this.rewardConfigs);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MinisRewardConfigResponse(List<MinisRewardConfigItem> list, Integer num, String str) {
        this.rewardConfigs = list;
        this.statusCode = num;
        this.statusMsg = str;
    }
}
