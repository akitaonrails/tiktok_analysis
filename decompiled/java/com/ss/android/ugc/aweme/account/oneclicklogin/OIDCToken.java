package com.ss.android.ugc.aweme.account.oneclicklogin;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class OIDCToken implements Serializable {

    @C09CT("device_secret")
    public final String deviceSecret;

    @C09CT("id_token")
    public final String oidcToken;

    @C09CT("id_token_id")
    public final String tokenID;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OIDCToken)) {
            return false;
        }
        OIDCToken oIDCToken = (OIDCToken) obj;
        return Intrinsics.LJFF(this.oidcToken, oIDCToken.oidcToken) && Intrinsics.LJFF(this.deviceSecret, oIDCToken.deviceSecret) && Intrinsics.LJFF(this.tokenID, oIDCToken.tokenID);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OIDCToken(oidcToken=");
        sbLIZ.append(this.oidcToken);
        sbLIZ.append(", deviceSecret=");
        sbLIZ.append(this.deviceSecret);
        sbLIZ.append(", tokenID=");
        sbLIZ.append(this.tokenID);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public OIDCToken(String str, String str2, String str3) {
        this.oidcToken = str;
        this.deviceSecret = str2;
        this.tokenID = str3;
    }
}
