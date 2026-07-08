package com.ss.android.ugc.aweme.rich.reward.gecko.api;

import X.C09CT;
import X.C1231604rq;
import X.C2188811AlT;
import com.google.gson.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class RewardGeckoPrefetchResponse {
    public static final C1231604rq LIZ = new C1231604rq();

    @C09CT("data")
    public final k data;

    @C09CT("status_code")
    public final int statusCode;

    public RewardGeckoPrefetchResponse() {
        this(-1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardGeckoPrefetchResponse)) {
            return false;
        }
        RewardGeckoPrefetchResponse rewardGeckoPrefetchResponse = (RewardGeckoPrefetchResponse) obj;
        return this.statusCode == rewardGeckoPrefetchResponse.statusCode && Intrinsics.LJFF(this.data, rewardGeckoPrefetchResponse.data);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        k kVar = this.data;
        return i + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RewardGeckoPrefetchResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RewardGeckoPrefetchResponse(int i, k kVar) {
        this.statusCode = i;
        this.data = kVar;
    }
}
