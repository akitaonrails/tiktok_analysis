package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class LinkTransResult extends BaseResponse {

    @C09CT("landing_url")
    public final String longUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinkTransResult) && Intrinsics.LJFF(this.longUrl, ((LinkTransResult) obj).longUrl);
    }

    public final int hashCode() {
        return this.longUrl.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkTransResult(longUrl=");
        sbLIZ.append(this.longUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LinkTransResult(String str) {
        this.longUrl = str;
    }
}
