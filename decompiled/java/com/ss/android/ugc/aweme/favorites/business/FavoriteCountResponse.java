package com.ss.android.ugc.aweme.favorites.business;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FavoriteCountResponse extends BaseResponse {

    @C09CT("collect_count")
    public final HashMap<String, Integer> count;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FavoriteCountResponse) && Intrinsics.LJFF(this.count, ((FavoriteCountResponse) obj).count);
    }

    public final int hashCode() {
        return this.count.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FavoriteCountResponse(count=");
        sbLIZ.append(this.count);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FavoriteCountResponse(HashMap<String, Integer> map) {
        this.count = map;
    }
}
