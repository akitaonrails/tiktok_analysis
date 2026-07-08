package com.ss.android.ugc.aweme.publish.model;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2126708Uv;

/* JADX INFO: loaded from: classes31.dex */
public final class STSAuthConfig extends AbstractC2126608Uu {

    @C09CT("access_key_id")
    @InterfaceC2126708Uv
    public String accessKeyId;

    @C09CT("secret_access_key")
    @InterfaceC2126708Uv
    public String secretAccessKey;

    @C09CT("session_token")
    @InterfaceC2126708Uv
    public String sessionToken;

    @C09CT("space_name")
    @InterfaceC2126708Uv
    public String spaceName;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("STSAuthConfig{accessKeyId='");
        sbLIZ.append(this.accessKeyId);
        sbLIZ.append("', secretAccessKey='");
        sbLIZ.append(this.secretAccessKey);
        sbLIZ.append("', sessionToken='");
        sbLIZ.append(this.sessionToken);
        sbLIZ.append("', spaceName='");
        sbLIZ.append(this.spaceName);
        sbLIZ.append("'}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
