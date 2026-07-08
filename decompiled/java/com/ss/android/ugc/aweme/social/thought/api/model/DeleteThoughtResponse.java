package com.ss.android.ugc.aweme.social.thought.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DeleteThoughtResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("deleted")
    public final Boolean deleted;

    public DeleteThoughtResponse() {
        this(null);
    }

    public final DeleteThoughtResponse copy(Boolean bool) {
        return new DeleteThoughtResponse(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteThoughtResponse) && Intrinsics.LJFF(this.deleted, ((DeleteThoughtResponse) obj).deleted);
    }

    public int hashCode() {
        Boolean bool = this.deleted;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteThoughtResponse(deleted=");
        sbLIZ.append(this.deleted);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean getDeleted() {
        return this.deleted;
    }

    public DeleteThoughtResponse(Boolean bool) {
        this.deleted = bool;
    }
}
