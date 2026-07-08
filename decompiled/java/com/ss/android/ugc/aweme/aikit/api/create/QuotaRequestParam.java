package com.ss.android.ugc.aweme.aikit.api.create;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class QuotaRequestParam {

    @C09CT("aigc_ids")
    public final List<Long> aigcIds;

    @C09CT("business_scene")
    public final String businessScene;

    @C09CT("expire_default_value")
    public final Integer expireDefaultValue;

    @C09CT("job_type")
    public final String jobType;

    public QuotaRequestParam() {
        this(null, null, null, 5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuotaRequestParam)) {
            return false;
        }
        QuotaRequestParam quotaRequestParam = (QuotaRequestParam) obj;
        return Intrinsics.LJFF(this.jobType, quotaRequestParam.jobType) && Intrinsics.LJFF(this.businessScene, quotaRequestParam.businessScene) && Intrinsics.LJFF(this.aigcIds, quotaRequestParam.aigcIds) && Intrinsics.LJFF(this.expireDefaultValue, quotaRequestParam.expireDefaultValue);
    }

    public final int hashCode() {
        String str = this.jobType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.businessScene;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Long> list = this.aigcIds;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.expireDefaultValue;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotaRequestParam(jobType=");
        sbLIZ.append(this.jobType);
        sbLIZ.append(", businessScene=");
        sbLIZ.append(this.businessScene);
        sbLIZ.append(", aigcIds=");
        sbLIZ.append(this.aigcIds);
        sbLIZ.append(", expireDefaultValue=");
        sbLIZ.append(this.expireDefaultValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QuotaRequestParam(String str, String str2, List<Long> list, Integer num) {
        this.jobType = str;
        this.businessScene = str2;
        this.aigcIds = list;
        this.expireDefaultValue = num;
    }
}
