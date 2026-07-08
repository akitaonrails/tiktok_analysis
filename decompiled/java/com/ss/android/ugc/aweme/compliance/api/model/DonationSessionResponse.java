package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DonationSessionResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("session_url")
    public final String sessionUrl;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public DonationSessionResponse() {
        this(0, "", "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonationSessionResponse)) {
            return false;
        }
        DonationSessionResponse donationSessionResponse = (DonationSessionResponse) obj;
        return this.statusCode == donationSessionResponse.statusCode && Intrinsics.LJFF(this.statusMsg, donationSessionResponse.statusMsg) && Intrinsics.LJFF(this.sessionUrl, donationSessionResponse.sessionUrl);
    }

    public int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.sessionUrl.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DonationSessionResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", sessionUrl=");
        sbLIZ.append(this.sessionUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DonationSessionResponse(int i, String str, String str2) {
        this.statusCode = i;
        this.statusMsg = str;
        this.sessionUrl = str2;
    }
}
