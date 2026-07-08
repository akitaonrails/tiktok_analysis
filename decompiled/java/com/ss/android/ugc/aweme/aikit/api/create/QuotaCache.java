package com.ss.android.ugc.aweme.aikit.api.create;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class QuotaCache {

    @C09CT("quota_result")
    public final QuotaResult quotaResult;

    @C09CT("quota_task_type_tag")
    public final String quotaTaskTypeTag;

    @C09CT("request_param")
    public final QuotaRequestParam requestParam;

    @C09CT("tsp")
    public final Long tsp;

    @C09CT("uid")
    public final String uid;

    public QuotaCache() {
        this(null, null, null, null, Long.valueOf(System.currentTimeMillis()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuotaCache)) {
            return false;
        }
        QuotaCache quotaCache = (QuotaCache) obj;
        return Intrinsics.LJFF(this.uid, quotaCache.uid) && Intrinsics.LJFF(this.quotaResult, quotaCache.quotaResult) && Intrinsics.LJFF(this.requestParam, quotaCache.requestParam) && Intrinsics.LJFF(this.quotaTaskTypeTag, quotaCache.quotaTaskTypeTag) && Intrinsics.LJFF(this.tsp, quotaCache.tsp);
    }

    public final int hashCode() {
        String str = this.uid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        QuotaResult quotaResult = this.quotaResult;
        int iHashCode2 = (iHashCode + (quotaResult == null ? 0 : quotaResult.hashCode())) * 31;
        QuotaRequestParam quotaRequestParam = this.requestParam;
        int iHashCode3 = (iHashCode2 + (quotaRequestParam == null ? 0 : quotaRequestParam.hashCode())) * 31;
        String str2 = this.quotaTaskTypeTag;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.tsp;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotaCache(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", quotaResult=");
        sbLIZ.append(this.quotaResult);
        sbLIZ.append(", requestParam=");
        sbLIZ.append(this.requestParam);
        sbLIZ.append(", quotaTaskTypeTag=");
        sbLIZ.append(this.quotaTaskTypeTag);
        sbLIZ.append(", tsp=");
        sbLIZ.append(this.tsp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public QuotaCache(String str, QuotaResult quotaResult, QuotaRequestParam quotaRequestParam, String str2, Long l) {
        this.uid = str;
        this.quotaResult = quotaResult;
        this.requestParam = quotaRequestParam;
        this.quotaTaskTypeTag = str2;
        this.tsp = l;
    }
}
