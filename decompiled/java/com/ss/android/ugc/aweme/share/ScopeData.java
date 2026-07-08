package com.ss.android.ugc.aweme.share;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ScopeData {

    @C09CT("app_name")
    public final String appName;

    @C09CT("description")
    public final String description;

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("pass_code")
    public final boolean passCode;

    @C09CT("scopes")
    public final List<Scope> scopes;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScopeData(scopes=");
        sbLIZ.append(this.scopes);
        sbLIZ.append(", appName=");
        sbLIZ.append(this.appName);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", passCode=");
        sbLIZ.append(this.passCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ScopeData(List<Scope> list, String str, String str2, int i, boolean z) {
        this.scopes = list;
        this.appName = str;
        this.description = str2;
        this.errorCode = i;
        this.passCode = z;
    }
}
