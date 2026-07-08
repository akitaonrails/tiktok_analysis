package com.ss.android.ugc.aweme.compliance.protection.antiaddiction.relieveaweme;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TiktokRelieveAweme extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("aweme_id")
    public final String awemeId;

    public final TiktokRelieveAweme copy(String str) {
        return new TiktokRelieveAweme(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TiktokRelieveAweme) && Intrinsics.LJFF(this.awemeId, ((TiktokRelieveAweme) obj).awemeId);
    }

    public int hashCode() {
        return this.awemeId.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokRelieveAweme(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public TiktokRelieveAweme(String str) {
        this.awemeId = str;
    }
}
