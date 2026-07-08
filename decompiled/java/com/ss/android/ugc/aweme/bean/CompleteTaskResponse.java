package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CompleteTaskResponse extends BaseResponse implements Serializable {

    @C09CT("success")
    public final Boolean success;

    public CompleteTaskResponse() {
        this(null);
    }

    public final CompleteTaskResponse copy(Boolean bool) {
        return new CompleteTaskResponse(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CompleteTaskResponse) && Intrinsics.LJFF(this.success, ((CompleteTaskResponse) obj).success);
    }

    public int hashCode() {
        Boolean bool = this.success;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompleteTaskResponse(success=");
        sbLIZ.append(this.success);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public CompleteTaskResponse(Boolean bool) {
        this.success = bool;
    }
}
