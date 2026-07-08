package com.ss.android.ugc.aweme.localservice.paramcheck;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class LsParamCheckResult {

    @C09CT("code")
    public final String code;

    @C09CT("data")
    public final Map<Object, Object> data;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LsParamCheckResult(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LsParamCheckResult(String str, Map<Object, ? extends Object> map) {
        this.code = str;
        this.data = map;
    }
}
