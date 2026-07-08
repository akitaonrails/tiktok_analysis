package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ShopifyUCPTokenResponse extends BaseResponse {

    @C09CT("access_token")
    public final String accessToken;

    @C09CT("client_ip")
    public final String clientIp;

    public ShopifyUCPTokenResponse() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopifyUCPTokenResponse)) {
            return false;
        }
        ShopifyUCPTokenResponse shopifyUCPTokenResponse = (ShopifyUCPTokenResponse) obj;
        return Intrinsics.LJFF(this.accessToken, shopifyUCPTokenResponse.accessToken) && Intrinsics.LJFF(this.clientIp, shopifyUCPTokenResponse.clientIp);
    }

    public final int hashCode() {
        String str = this.accessToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientIp;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopifyUCPTokenResponse(accessToken=");
        sbLIZ.append(this.accessToken);
        sbLIZ.append(", clientIp=");
        sbLIZ.append(this.clientIp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShopifyUCPTokenResponse(String str, String str2) {
        super(null, null);
        this.accessToken = str;
        this.clientIp = str2;
    }
}
