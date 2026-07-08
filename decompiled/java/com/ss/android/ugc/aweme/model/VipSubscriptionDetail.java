package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class VipSubscriptionDetail implements Serializable {
    public static final int $stable = 0;

    @C09CT("auto_renew_time")
    public final long autoRenewTime;

    @C09CT("contract_id")
    public final String contractId;

    @C09CT("cycle")
    public final VipSubscriptionCycleType cycle;

    @C09CT("expired_time")
    public final long expiredTime;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final VipSubscriptionStatus status;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipSubscriptionDetail)) {
            return false;
        }
        VipSubscriptionDetail vipSubscriptionDetail = (VipSubscriptionDetail) obj;
        return Intrinsics.LJFF(this.skuId, vipSubscriptionDetail.skuId) && Intrinsics.LJFF(this.contractId, vipSubscriptionDetail.contractId) && this.status == vipSubscriptionDetail.status && this.autoRenewTime == vipSubscriptionDetail.autoRenewTime && this.expiredTime == vipSubscriptionDetail.expiredTime && this.cycle == vipSubscriptionDetail.cycle;
    }

    public int hashCode() {
        return (((((((((this.skuId.hashCode() * 31) + this.contractId.hashCode()) * 31) + this.status.hashCode()) * 31) + C786410Ut5.Y2(this.autoRenewTime)) * 31) + C786410Ut5.Y2(this.expiredTime)) * 31) + this.cycle.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VipSubscriptionDetail(skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", contractId=");
        sbLIZ.append(this.contractId);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", autoRenewTime=");
        sbLIZ.append(this.autoRenewTime);
        sbLIZ.append(", expiredTime=");
        sbLIZ.append(this.expiredTime);
        sbLIZ.append(", cycle=");
        sbLIZ.append(this.cycle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VipSubscriptionDetail() {
        this("", "", VipSubscriptionStatus.SUBSCRIPTION_STATUS_EMPTY, 0L, 0L, VipSubscriptionCycleType.SUBSCRIPTION_CYCLE_TYPE_WEEK);
    }

    public VipSubscriptionDetail(String str, String str2, VipSubscriptionStatus vipSubscriptionStatus, long j, long j2, VipSubscriptionCycleType vipSubscriptionCycleType) {
        this.skuId = str;
        this.contractId = str2;
        this.status = vipSubscriptionStatus;
        this.autoRenewTime = j;
        this.expiredTime = j2;
        this.cycle = vipSubscriptionCycleType;
    }
}
