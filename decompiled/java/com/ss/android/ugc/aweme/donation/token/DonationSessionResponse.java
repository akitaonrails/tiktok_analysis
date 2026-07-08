package com.ss.android.ugc.aweme.donation.token;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DonationSessionResponse extends BaseResponse implements Serializable {

    @C09CT("session_url")
    public final String sessionUrl;

    public final DonationSessionResponse copy(String str) {
        return new DonationSessionResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DonationSessionResponse) && Intrinsics.LJFF(this.sessionUrl, ((DonationSessionResponse) obj).sessionUrl);
    }

    public int hashCode() {
        String str = this.sessionUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DonationSessionResponse(sessionUrl=");
        sbLIZ.append(this.sessionUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getSessionUrl() {
        return this.sessionUrl;
    }

    public DonationSessionResponse(String str) {
        this.sessionUrl = str;
    }
}
