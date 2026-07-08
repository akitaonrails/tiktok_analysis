package com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EcUgRedirectSchemaResponse extends BaseResponse {

    @C09CT("schema")
    public final String schema;

    public EcUgRedirectSchemaResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EcUgRedirectSchemaResponse) && Intrinsics.LJFF(this.schema, ((EcUgRedirectSchemaResponse) obj).schema);
    }

    public final int hashCode() {
        String str = this.schema;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcUgRedirectSchemaResponse(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcUgRedirectSchemaResponse(String str) {
        this.schema = str;
    }
}
