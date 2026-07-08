package com.ss.android.ugc.aweme.account.login.v2.network;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EdmUserPropertiesResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("data")
    public final Data data;

    public EdmUserPropertiesResponse() {
        this(null);
    }

    public final EdmUserPropertiesResponse copy(Data data) {
        return new EdmUserPropertiesResponse(data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EdmUserPropertiesResponse) && Intrinsics.LJFF(this.data, ((EdmUserPropertiesResponse) obj).data);
    }

    public int hashCode() {
        Data data = this.data;
        if (data == null) {
            return 0;
        }
        return data.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EdmUserPropertiesResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Data getData() {
        return this.data;
    }

    public EdmUserPropertiesResponse(Data data) {
        this.data = data;
    }
}
