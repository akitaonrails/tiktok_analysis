package com.ss.android.ugc.aweme.autofill.api;

import X.C09CS;
import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class AdAutofillGetResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("fields")
    @C09CS(JsonToStringAdapter.class)
    public final String fields;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public AdAutofillGetResponse() {
        this(null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdAutofillGetResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", fields=");
        sbLIZ.append(this.fields);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AdAutofillGetResponse(Integer num, String str, String str2) {
        this.statusCode = num;
        this.statusMsg = str;
        this.fields = str2;
    }
}
