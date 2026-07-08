package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DraftMusicPermissionCheckResponse extends BaseResponse {

    @C09CT("results")
    public List<DraftMusicPermissionCheckResultBean> result;

    public DraftMusicPermissionCheckResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DraftMusicPermissionCheckResponse) && Intrinsics.LJFF(this.result, ((DraftMusicPermissionCheckResponse) obj).result);
    }

    public final int hashCode() {
        List<DraftMusicPermissionCheckResultBean> list = this.result;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftMusicPermissionCheckResponse(result=");
        sbLIZ.append(this.result);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DraftMusicPermissionCheckResponse(List<DraftMusicPermissionCheckResultBean> list) {
        this.result = list;
    }
}
